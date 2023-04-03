package Ex5;

public class Eletronico extends Produto{
    private String nome;
    private double preco;
    public Eletronico(String nome, double preco) {
        super(nome, preco);
        this.nome = nome;
        this.preco = preco;
    }
    @Override
    public void calcularDesconto(){
        double precoNovo = preco-preco*0.7;
        System.out.println(nome+" Desconto: "+precoNovo);
    }
}
