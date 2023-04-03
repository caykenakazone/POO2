package Ex12;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Garagem gr = new Garagem();
        Carro cr = new Carro("BMW","m4",2020);
        Moto mt = new Moto("Yamaha","XJ6",2020);
        gr.estacionar(cr);
        gr.estacionar(mt);
    }
}
