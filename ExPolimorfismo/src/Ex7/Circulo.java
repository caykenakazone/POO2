package Ex7;

public class Circulo extends Figura {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }
    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }
}
