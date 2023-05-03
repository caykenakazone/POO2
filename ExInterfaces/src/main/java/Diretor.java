public class Diretor extends Funcionario implements Autenticavel {
    private String senha;
    private int nivel;

    public Diretor(String nome, String cpf, double salario, String senha, int nivel) {
        super(nome, cpf, salario);
        this.senha = senha;
        this.nivel = nivel;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}
