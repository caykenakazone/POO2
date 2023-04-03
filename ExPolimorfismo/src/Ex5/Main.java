package Ex5;

public class Main {
    public static void main(String[] args) {
        Produto ali = new Alimento("Alimento", 40);
        Produto vest = new Vestuario("Vestuario", 120);
        Produto elet = new Eletronico("Eletronico", 500);

        ali.calcularDesconto();
        vest.calcularDesconto();
        elet.calcularDesconto();
    }
}
