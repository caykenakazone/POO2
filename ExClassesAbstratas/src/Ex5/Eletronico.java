package Ex5;

public class Eletronico extends Produto {
    public Eletronico(String nome, double preco) {
        super(nome, preco);
    }

    public double calcularDesconto() {
        return preco * 0.1;
    }
}
