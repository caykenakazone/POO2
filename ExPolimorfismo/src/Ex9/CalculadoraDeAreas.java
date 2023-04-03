package Ex9;


import java.util.List;

public class CalculadoraDeAreas {
    public double somarAreas(List<Forma> formas) {
        double total = 0;
        for (Forma forma : formas) {
            total += forma.calcularArea();
        }
        return total;
    }
}