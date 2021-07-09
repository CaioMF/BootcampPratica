package br.com.meli.clients.controller;

import br.com.meli.clients.dto.ClientDTO;
import br.com.meli.clients.entity.Client;
import br.com.meli.clients.repository.ClientRepository;
import br.com.meli.clients.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("client")
public class ClientController {

    private final ClientService clientService;

    @Autowired
    public ClientController(ClientService  cr) {
        this.clientService = cr;
    }

    @GetMapping("/{value}")
    public ClientDTO find(@PathVariable String value){
        return ClientDTO.convert(clientService.find(value));
    }

    @PostMapping
    public String create(@RequestBody Client client){
        clientService.save(client);
        return "Cadastrado";
    }
}
