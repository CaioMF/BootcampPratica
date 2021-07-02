package br.com.meli.day2.Sys;

import java.math.BigDecimal;

public class Director extends CLT{

    public Director(Office office, int NTargets, String name,Company company) {
        super(office, 15000, NTargets, name, company);
    }

    @Override
    public double getSalary() {
        BigDecimal bonus = company.getProfits().multiply(new BigDecimal(3)).divide(new BigDecimal(100));
        return this.salaryBase += bonus.doubleValue();
    }

}
