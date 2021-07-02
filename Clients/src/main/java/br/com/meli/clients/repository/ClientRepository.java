package br.com.meli.clients.repository;

import br.com.meli.clients.entity.Client;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ClientRepository {

    List<Client> clients = new ArrayList<>();

    public void create(Client client){
        client.setId(clients.size()+1);
        clients.add(client);
    }

    public Client find(String cpf){
        return clients.stream().filter(a -> a.getCpf().equals(cpf)).findFirst().orElseThrow(RuntimeException::new);
    }
}
