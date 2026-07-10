package com.daniel.passwordvault.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.daniel.passwordvault.entity.Credential;
import com.daniel.passwordvault.repository.CredentialRepository;

@Service
public class CredentialService {

    private final CredentialRepository credentialRepository;

    public CredentialService(CredentialRepository credentialRepository) {
        this.credentialRepository = credentialRepository;
    }

    public Credential saveCredential(Credential credential) {
        return credentialRepository.save(credential);
    }

    public List<Credential> getAllCredentials() {
        return credentialRepository.findAll();
    }
}