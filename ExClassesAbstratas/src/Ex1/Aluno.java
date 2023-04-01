package Ex1;


public class Aluno extends Pessoa {
    private String curso;

    public Aluno(String nome, String curso) {
        super(nome);
        this.curso = curso;
    }

    @Override
    public void apresentar() {
        System.out.println("Nome: " + super.nome + "  Curso " + curso+"\n");
    }
}
