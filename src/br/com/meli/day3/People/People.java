package br.com.meli.day3.People;

public class People implements Previous<People>{

    private String name;
    private String cpf;

    public People(String name, String cpf) {
        this.name = name;
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public int previousA(People o) {
        return o.getName().compareTo(this.name);
    }

    @Override
    public String toString() {
        return  this.name ;
    }
}
