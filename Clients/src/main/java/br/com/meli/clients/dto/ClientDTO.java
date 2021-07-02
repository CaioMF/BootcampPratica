package br.com.meli.clients.dto;

import br.com.meli.clients.entity.Client;
import br.com.meli.clients.entity.Order;

import java.util.List;

public class ClientDTO {

    private String name;
    private String email;
    private List<Order> orders;

    public ClientDTO(String name, String email, List<Order> orders) {
        this.name = name;
        this.email = email;
        this.orders = orders;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public static ClientDTO convert(Client c){
        return new ClientDTO(c.getName(),c.getEmail(),c.getOrders());
    }
}
