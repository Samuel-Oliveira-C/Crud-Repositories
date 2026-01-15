package com.example.exercicio.services;

import org.springframework.transaction.annotation.Transactional;

import com.example.exercicio.model.dto.ClientDTO;
import com.example.exercicio.model.entity.Client;
import com.example.exercicio.repository.ClientRepository;

public class ClientService {
    private final ClientRepository repository;
    
    public ClientService(ClientRepository clientRepository) {
        this.repository = clientRepository;
    }

    @Transactional
    public ClientDTO saveClient(ClientDTO clientDTO){
        Client clientEntity = new Client();
        copyEntityToDTO(clientEntity, clientDTO);
        clientEntity = repository.save(clientEntity);
        return new ClientDTO(clientEntity);
    }

    public ClientDTO copyEntityToDTO(Client entity, ClientDTO dto){
        return new ClientDTO(entity);
    }
}
