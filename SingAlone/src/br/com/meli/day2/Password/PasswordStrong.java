package br.com.meli.day2.Password;

public class PasswordStrong extends Password{



    public PasswordStrong(String password) {

        super("(?=.*[A-Z])(?=.*[!@#$&*])(?=.*[0-9])(?=.*[a-z]).{8}",password);

    }

    public PasswordStrong() {
        super("(?=.*[A-Z])(?=.*[!@#$&*])(?=.*[0-9])(?=.*[a-z]).{8}");
    }

    public static void main(String[] args) {
        new PasswordStrong().setValue("asd");
        System.out.println("passou");
    }

}
