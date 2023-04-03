package Ex5;

public class Alimento extends Produto{
    private String nome;
    private double preco;
    public Alimento(String nome, double preco) {
        super(nome, preco);
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public void calcularDesconto(){
        double precoNovo = preco-preco*0.2;
        System.out.println(nome+" Desconto: "+precoNovo);
    }
}
