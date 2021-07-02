package br.com.meli.day4.LaCiqui;

import java.io.IOException;

public class IndviFirework implements Firework{

    private String sound;

    public IndviFirework(String sound) {
        this.sound = sound;
    }

    @Override
    public void explosion() {
        System.out.println(this.sound+"!");
        try {
            Thread.sleep(1000);
            if (System.getProperty("os.name").contains("Windows"))
                Runtime.getRuntime().exec("cls");
            else
                Runtime.getRuntime().exec("clear");
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }

    }


}
