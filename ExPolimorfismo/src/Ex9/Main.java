package Ex9;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Circulo circulo1 = new Circulo(5);
        Circulo circulo2 = new Circulo(10);
        Quadrado quadrado1 = new Quadrado(7);
        Triangulo triangulo1 = new Triangulo(3, 5);
        Triangulo triangulo2 = new Triangulo(6, 8);

        List<Forma> formas = new ArrayList<>();
        formas.add(triangulo1);
        formas.add(triangulo2);
        formas.add(circulo1);
        formas.add(circulo2);
        formas.add(quadrado1);

        CalculadoraDeAreas calculadora = new CalculadoraDeAreas();
        double total = calculadora.somarAreas(formas);

        System.out.println("A soma das áreas é: " + total);
    }
}
