package br.com.meli.day2.Sys;

import java.math.BigDecimal;

public class Company {

    private String name;
    private BigDecimal profits;

    public Company(String name, BigDecimal profits) {
        this.name = name;
        this.profits = profits;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getProfits() {
        return this.profits;
    }

    public void setProfits(BigDecimal profits) {
        this.profits = profits;
    }
}
