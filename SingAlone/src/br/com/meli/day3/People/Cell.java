package br.com.meli.day3.People;

public class Cell implements Previous<Cell> {

    private String number;
    private People Holder;

    public Cell(String number, People holder) {
        this.number = number;
        Holder = holder;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public People getHolder() {
        return Holder;
    }

    public void setHolder(People holder) {
        Holder = holder;
    }

    @Override
    public int previousA(Cell o) {

        return o.getNumber().compareTo(this.number);

    }

    @Override
    public String toString() {
        return number;
    }

}
