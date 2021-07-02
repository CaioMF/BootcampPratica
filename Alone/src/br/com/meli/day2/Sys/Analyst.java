package br.com.meli.day2.Sys;

public class Analyst extends CLT{

    public Analyst(Office office, int NTargets, String name,Company company) {
        super(office, 4000, NTargets, name, company);
    }

    @Override
    public double getSalary() {
        double bonus = (8 * this.NTargets ) /100;
        return this.salaryBase += this.salaryBase * bonus;
    }
}
