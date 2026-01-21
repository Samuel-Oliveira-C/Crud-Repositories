package com.example.exercicio.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.exercicio.model.dto.ClientDTO;
import com.example.exercicio.model.entity.Client;
import com.example.exercicio.repository.ClientRepository;

@Service
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

    @Transactional
    public ClientDTO updateClient(String id, ClientDTO dto){
        Client entity = repository.getReferenceById(id);
        return copyEntityToDTO(entity, dto);
    }

    public ClientDTO copyEntityToDTO(Client entity, ClientDTO dto){
        entity.setName(dto.name());
        entity.setEmail(dto.email());
        entity.setIncome(dto.income());
        entity.setBirthDate(dto.birthDate());
        entity.setCpf(dto.cpf());
        return new ClientDTO(entity);
    }
}
