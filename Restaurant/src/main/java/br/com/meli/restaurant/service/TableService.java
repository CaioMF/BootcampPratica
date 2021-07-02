package br.com.meli.restaurant.service;

import br.com.meli.restaurant.entity.Order;
import br.com.meli.restaurant.repository.TableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TableService {

    @Autowired
    private TableRepository tr;

    public List<Order> getOrders(long id){
         return tr.getTables().stream().filter(a -> a.getId() == id).findFirst().orElseThrow(RuntimeException::new).getOrderList();
     }

     public TableRepository getTr() {
        return tr;
    }

}
