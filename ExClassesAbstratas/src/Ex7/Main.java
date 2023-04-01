package Ex7;

public class Main {
    public static void main(String[] args) {
        Figura tr = new Triangulo(3, 4);
        Figura ret = new Retangulo(5, 6);
        Figura circ = new Circulo(7);

        System.out.println("Área do Triângulo: " + tr.calcularArea());
        System.out.println("Área do Retângulo: " + ret.calcularArea());
        System.out.println("Área do Círculo: " + circ.calcularArea());
    }
}
