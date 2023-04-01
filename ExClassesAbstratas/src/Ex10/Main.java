package Ex10;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cachorro cach = new Cachorro();
        Gato gato = new Gato();
        Vaca vaca = new Vaca();
        Galinha galinha = new Galinha();

        List<Animal> animais = new ArrayList<>();
        animais.add(cach);
        animais.add(gato);
        animais.add(vaca);
        animais.add(galinha);
        Fazenda fazenda = new Fazenda();
        fazenda.alimentarAnimais(animais);

        System.out.println("\n");

        cach.latir();
        gato.miar();
        vaca.mugir();

        }
    }

