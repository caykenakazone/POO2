package Ex1;

public class Pessoa {
    String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public void apresentar() {
        System.out.println("Meu nome é " + nome);
    }
}
