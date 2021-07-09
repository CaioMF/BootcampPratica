package br.com.meli.clients.service;

import br.com.meli.clients.entity.Client;
import br.com.meli.clients.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClientService {


    private final ClientRepository clientRepository;

    @Autowired
    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public void save(Client client){
        clientRepository.save(client);
    }

    public Client find(String cpf){
        return clientRepository.findByCpf(cpf);
    }

    public List<Client> all(){
        return clientRepository.findAll();
    }

    public void delete(String cpf){
        clientRepository.delete(find(cpf));
    }

}
