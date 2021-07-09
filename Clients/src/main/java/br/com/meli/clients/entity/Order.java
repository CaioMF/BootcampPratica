package br.com.meli.clients.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;


@Entity
@Table(name="order_tb")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    private Client client;

    @OneToMany
    private List<Product> products;

    private double totalValue;
    private LocalDate date;

    public Order(long id, List<Product> products, double totalValue,LocalDate date) {
        this.id = id;
        this.products = products;
        this.totalValue = totalValue;
        this.date = date;
    }

    public Order() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public double getTotalValue() {
        return products.stream().mapToDouble(p -> p.getValue() * p.getCount()).sum();
    }


}
