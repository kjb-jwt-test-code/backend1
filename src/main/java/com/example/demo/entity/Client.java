package com.example.demo.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Table(name = "client")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Client {

    @Id
    @Column(name = "client_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clientId;

    @Column(name = "id")
    private String id;
    @Column(name = "password")
    private String password;

    @ManyToMany
    @JoinTable(
            name = "client_authority",
            joinColumns = {@JoinColumn(name = "client_id", referencedColumnName = "client_id")},
            inverseJoinColumns = {@JoinColumn(name = "authority_name", referencedColumnName = "authority_name")})
    private Set<Authority> authorities;
}
