package com.bmt.projectpibj.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bmt.projectpibj.models.Client;

public interface ClientRepository extends JpaRepository<Client, Integer> {

	public Client findByEmail(String email);
}