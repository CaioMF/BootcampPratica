package br.com.meli.day2.Sys;

public class Manager extends CLT{

    public Manager(Office office, int NTargets, String name,Company company) {
        super(office, 6000, NTargets, name, company);
    }

    @Override
    public double getSalary() {
        double bonus = (12.5 * this.NTargets ) /100;
        return this.salaryBase += this.salaryBase * bonus;
    }
}
