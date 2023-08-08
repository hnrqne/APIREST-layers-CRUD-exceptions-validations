package com.hnrqne.crudclient.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hnrqne.crudclient.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
