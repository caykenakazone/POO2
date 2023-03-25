package Ex5;

public class Vestuario extends Produto{
    private String nome;
    private double preco;

    public Vestuario(String nome, double preco) {
        super(nome, preco);
        this.nome = nome;
        this.preco = preco;
    }
    @Override
    public void calcularDesconto(){
        double precoNovo = preco-preco*0.5;
        System.out.println(nome+" Desconto: "+precoNovo);
    }
}
