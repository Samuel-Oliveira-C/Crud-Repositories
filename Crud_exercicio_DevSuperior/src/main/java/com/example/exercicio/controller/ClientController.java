package com.example.exercicio.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.exercicio.model.dto.ClientDTO;
import com.example.exercicio.services.ClientService;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/clients")
public class ClientController {
    private final ClientService service;

    public ClientController(ClientService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<ClientDTO> createEntity(@RequestBody ClientDTO dto){
        ClientDTO savedClient = service.saveClient(dto);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
            .buildAndExpand(savedClient.id()).toUri();
        return ResponseEntity.created(uri).body(dto);
    }

}
