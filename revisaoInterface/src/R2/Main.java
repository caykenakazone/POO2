package R2;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        FormaGeometrica R = new Retangulo(2,4);
        FormaGeometrica C = new Circulo(2);

        System.out.println(df.format(R.calcularArea()));
        System.out.println(df.format(C.calcularArea()));
        System.out.println(df.format(R.calcularPerimetro()));
        System.out.println(df.format(C.calcularPerimetro()));
    }
}
