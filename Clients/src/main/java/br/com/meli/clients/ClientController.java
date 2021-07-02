package br.com.meli.clients;

import br.com.meli.clients.dto.ClientDTO;
import br.com.meli.clients.entity.Client;
import br.com.meli.clients.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("client")
public class ClientController {

    private final ClientRepository cr;

    @Autowired
    public ClientController(ClientRepository cr) {
        this.cr = cr;
    }

    @GetMapping("/{value}")
    public ClientDTO find(@PathVariable String value){
        return ClientDTO.convert(cr.find(value));
    }

    @PostMapping
    public String create(@RequestBody Client client){
        cr.create(client);
        return "Cadastrado";
    }
}
