package com.zl.api.gestion.client.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zl.api.gestion.client.entity.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}
