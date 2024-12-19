package com.bmt.projectpibj.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bmt.projectpibj.models.AppUser;

public interface AppUserRepository extends JpaRepository<AppUser, Integer> {

	public AppUser findByEmail(String email);
}
