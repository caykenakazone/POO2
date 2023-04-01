package Ex5;

public class Main {
    public static void main(String[] args) {
        Produto ali = new Alimento("Alimento", 40);
        Produto vest = new Vestuario("Vestuario", 120);
        Produto elet = new Eletronico("Eletronico", 500);

        System.out.println("Alimentos tem desconto de: "+ali.calcularDesconto());
        System.out.println("Vestuário tem desconto de: "+vest.calcularDesconto());
        System.out.println("Eletronicos tem desconto de: "+elet.calcularDesconto());
    }
}
