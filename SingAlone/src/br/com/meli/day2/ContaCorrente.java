package br.com.meli.day2;

import java.math.BigDecimal;

public class ContaCorrente {

    private BigDecimal amount = new BigDecimal(0);
    private BigDecimal lastDeposit;

    public ContaCorrente(BigDecimal amount) {
        this.amount = amount;
    }

    public ContaCorrente(ContaCorrente account) {
        this.amount = account.getAmount();
        this.lastDeposit = account.getLastDeposit();
    }

    public ContaCorrente() {
    }

    public BigDecimal getLastDeposit() {
        return lastDeposit;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public void deposit(BigDecimal value){
        this.amount = this.amount.add(value);
        this.lastDeposit = value;
    }

    public void withdraw(BigDecimal value){
        this.amount = this.amount.subtract(value);
    }

    public void send(ContaCorrente account,BigDecimal value){

        if(this.amount.subtract(value).compareTo(new BigDecimal(0)) > 0) {
            account.deposit(value);
            this.amount = this.amount.subtract(value);
        }else {
            System.out.println("Saldo insuficiente");
        }

        System.out.println(this.amount);
    }

    public void devolution(){
       this.amount = this.amount.subtract(lastDeposit);
    }

}
