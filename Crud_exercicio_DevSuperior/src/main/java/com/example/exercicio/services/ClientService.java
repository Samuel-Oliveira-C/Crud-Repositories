package com.example.exercicio.services;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
        if(!repository.existsById(id)){
            throw new ResourceNotFound("Entity not found");
        }
        else{
            Client entity = repository.getReferenceById(id);
            return copyEntityToDTO(entity, dto);
        }
    }

    @Transactional
    public void deleteClient(String id){
        if(!repository.existsById(id)){
            throw new ResourceNotFound("Entity not found");
        }
        else{
            repository.deleteById(id);
        }
    }

    @Transactional(readOnly = true)
    public ClientDTO findByID(String id){
        if(!repository.existsById(id)){
            throw new ResourceNotFound("Entity not found");
        }
        else{
            Client entity = repository.getReferenceById(id);
            return new ClientDTO(entity);
        }
    }

    @Transactional(readOnly = true)
    public Page<ClientDTO> findAllPaged(Pageable pageable){
        Page<Client> list = repository.findAll(pageable);
        return list.map(x -> new ClientDTO(x));
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
