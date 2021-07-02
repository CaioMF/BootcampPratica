package br.com.meli.day2;

public class Fraction {

    private float x;
    private float y;

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float add(int x, int y){
        return this.x/this.y + x/y;
    }

    public float add(int n){
        return this.x/this.y + n;
    }

    public float sub(int x, int y){

        return this.x/this.y - x/y;

    }

    public float sub(int n){
        return this.x/this.y - n;
    }

    public float plus(int x, int y){
        return (this.x/this.y ) * (x/y);
    }

    public float plus(int n){

        return this.x/this.y * n;

    }

    public float div(int x, int y){
        return (this.x/this.y) - (x/y);
    }

    public float div(int n){
        return this.x/this.y * n;
    }


}
