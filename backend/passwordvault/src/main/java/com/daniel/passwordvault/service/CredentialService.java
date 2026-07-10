package com.daniel.passwordvault.service;

import org.springframework.stereotype.Service;

import com.daniel.passwordvault.repository.CredentialRepository;

@Service
public class CredentialService {

    private final CredentialRepository credentialRepository;

    public CredentialService(CredentialRepository credentialRepository) {
        this.credentialRepository = credentialRepository;
    }

}