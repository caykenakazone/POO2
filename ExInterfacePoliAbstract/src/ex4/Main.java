package ex4;

public class Main {
    public static void main(String[] args) {
        Linha l1 = new Linha(2,3,4,5);
        System.out.println(l1.getTamanho());
        Linha l2 = new Linha(6,4,2,1);
        System.out.println(l2.getTamanho());
        Linha l3 = new Linha(9,2,3,6);
        System.out.println(l3.getTamanho());
    }
}
