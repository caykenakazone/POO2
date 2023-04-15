package ex3;

import java.util.ArrayList;
import java.util.List;

public class Main {
        public static void main(String[] args) {
            List<FormaGeometrica> formasGeometricas = new ArrayList<>();
            Retangulo retangulo = new Retangulo(3, 4);
            Circulo circulo = new Circulo(5);
            formasGeometricas.add(retangulo);
            formasGeometricas.add(circulo);

            for (FormaGeometrica forma : formasGeometricas) {
                System.out.println("Perímetro: " + forma.calcularPerimetro());
                System.out.println("Área: " + forma.calcularArea());
            }
    }
}
