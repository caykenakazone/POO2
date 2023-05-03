package ex5;

import ex4.Relacao;

public class Main {
    public static void main(String[] args) {
        Retangulo r1 = new Retangulo(4,5);
        Retangulo r2 = new Retangulo(6,3);
        System.out.println(r1.eMaior(r2));
    }
}
