package com.daniel.passwordvault.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daniel.passwordvault.entity.Credential;

public interface CredentialRepository extends JpaRepository<Credential, Long> {

}