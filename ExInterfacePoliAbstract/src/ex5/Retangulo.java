package ex5;

public class Retangulo implements FormaGeometrica, Relacao {
    private int base, altura;

    public Retangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public Retangulo() {
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (this.base + this.altura);
    }

    @Override
    public double calcularArea() {
        return this.base * this.altura;
    }

    @Override
    public boolean eMaior(FormaGeometrica a) {
        return this.calcularArea() > a.calcularArea();
    }

    @Override
    public boolean eMenor(FormaGeometrica a) {
        return this.calcularArea() < a.calcularArea();
    }

    @Override
    public boolean eIgual(FormaGeometrica a) {
        return this.calcularArea() == a.calcularArea();
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }


}
