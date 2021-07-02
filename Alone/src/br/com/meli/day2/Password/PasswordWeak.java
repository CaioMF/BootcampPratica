package br.com.meli.day2.Password;

public class PasswordWeak extends Password{



    public PasswordWeak(String password) {

        super("^{8}$",password);

    }

    public PasswordWeak() {
        super("^{8}$");
    }

    public static void main(String[] args) {
        new PasswordWeak().setValue("asd");
        System.out.println("passou");
    }

}
