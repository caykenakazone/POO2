package Ex1;

public class Professor extends Pessoa {
    private String area;

    public Professor(String nome, String area) {
        super(nome);
        this.area = area;
    }

    @Override
    public void apresentar() {
        System.out.println("Nome: " + super.nome + "  Área de formação:  " + area+"\n");
    }
}
