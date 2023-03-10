package com.example.demo.repository;

import com.example.demo.entity.Client;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClientRepository extends JpaRepository<Client, Long> {
   @EntityGraph(attributePaths = "authorities")
   Optional<Client> findOneWithAuthoritiesById(String id);
}
