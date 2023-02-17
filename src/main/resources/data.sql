insert into client (id, password) values ('client', '$2a$08$lDnHPz7eUkSi6ao14Twuau08mzhWrL4kyZGGU5xfiGALO/Vxd5DOi');
insert into client (id, password) values ('manager', '$2a$08$lDnHPz7eUkSi6ao14Twuau08mzhWrL4kyZGGU5xfiGALO/Vxd5DOi');
insert into client (id, password) values ('admin', '$2a$08$lDnHPz7eUkSi6ao14Twuau08mzhWrL4kyZGGU5xfiGALO/Vxd5DOi');

insert into authority (authority_name) values ('ROLE_USER');
insert into authority (authority_name) values ('ROLE_MANAGER');
insert into authority (authority_name) values ('ROLE_ADMIN');

insert into client_authority (client_id, authority_name) values (1, 'ROLE_USER');
insert into client_authority (client_id, authority_name) values (2, 'ROLE_USER');
insert into client_authority (client_id, authority_name) values (2, 'ROLE_MANAGER');
insert into client_authority (client_id, authority_name) values (3, 'ROLE_USER');
insert into client_authority (client_id, authority_name) values (3, 'ROLE_MANAGER');
insert into client_authority (client_id, authority_name) values (3, 'ROLE_ADMIN');
