package br.com.meli.day4.LaCiqui;

import java.util.ArrayList;
import java.util.List;

public class PackageFirework implements Firework{

    private List<Firework> fireworks = new ArrayList<>();

    public PackageFirework(List<Firework> fireworks) {
        this.fireworks = fireworks;
    }
    public PackageFirework(IndviFirework fireworks) {
        this.fireworks.add(fireworks);
    }

    @Override
    public void explosion() {

        for(Firework f: fireworks){
            f.explosion();
        }

    }

}
