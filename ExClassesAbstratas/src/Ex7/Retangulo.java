package Ex7;

public class Retangulo extends Figura {
    protected double base;
    protected double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return base * altura;
    }
}
