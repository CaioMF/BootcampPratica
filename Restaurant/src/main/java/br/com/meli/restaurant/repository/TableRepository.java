package br.com.meli.restaurant.repository;

import br.com.meli.restaurant.entity.Table;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TableRepository {

    public List<Table> tables = new ArrayList<>();
    public double caixa = 1000;

    public void add(Table table) {
        tables.add(table);
    }

    public void find(long id){
        tables.stream().filter(a-> a.getId() == id).findFirst().orElseThrow(RuntimeException::new);
    }

    public void close(){
        this.caixa += tables.stream().mapToDouble(Table::getValueTotal).sum();
        tables.forEach(a -> a.setOrderList(null));
    }

    public double getCaixa(){
        return this.caixa;
    }

    public List<Table> getTables() {
        return tables;
    }
}
