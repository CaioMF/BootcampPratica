package br.com.meli.day2.Sys;

public class Technician extends CLT{

    public Technician(Office office, int NTargets, String name,Company company) {
        super(office, 3200, NTargets, name, company);
    }

    @Override
    public double getSalary() {
        double bonus = (5 * this.NTargets ) /100;
        return this.salaryBase += this.salaryBase * bonus;
    }
}
