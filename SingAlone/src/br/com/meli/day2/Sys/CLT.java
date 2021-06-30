package br.com.meli.day2.Sys;

public abstract class CLT extends People{

    protected Office office;
    protected double salaryBase;
    protected int NTargets;

    public CLT(Office office, double salaryBase, int NTargets, String name, Company company) {
        this.office = office;
        this.salaryBase = salaryBase;
        this.NTargets = NTargets;
        this.name = name;
        this.company = company;
    }

    public Office getOffice() {
        return office;
    }

    public double getSalaryBase() {
        return salaryBase;
    }

    public int getNTargets() {
        return NTargets;
    }

    @Override
    public abstract double getSalary();

}
