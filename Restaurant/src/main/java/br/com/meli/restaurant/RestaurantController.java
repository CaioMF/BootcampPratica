package br.com.meli.restaurant;

import br.com.meli.restaurant.entity.Order;
import br.com.meli.restaurant.entity.Table;
import br.com.meli.restaurant.service.TableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestaurantController {

    @Autowired
    private TableService ts;


    @PostMapping
    public String add(@RequestBody Table table) {

        ts.getTr().add(table);
        return "Inserido com sucesso!";

    }

    @GetMapping
    public String close(){
        ts.getTr().close();

        return "Fechou tudo!";

    }

    @GetMapping("/order/{value}")
    public List<Order> getOrder(@PathVariable long value){
        return ts.getOrders(value);
    }

    @GetMapping("/caixa")
    public double caixa(){
        return ts.getTr().getCaixa();
    }

}
