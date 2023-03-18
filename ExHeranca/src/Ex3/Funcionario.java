package Ex3;

public class Funcionario extends Pessoa {
    private int matricula;
    private double salario;

    public Funcionario() {}

    public Funcionario(String nome, String sobrenome, int matricula, double salario) {
        super(nome, sobrenome);
        this.matricula = matricula;
        if (salario >= 0) {
            this.salario = salario;
        }
    }
    public double getSalarioPrimeiraParcela() {
        return salario * 0.6;
    }

    public double getSalarioSegundaParcela() {
        return salario * 0.4;
    }
    // Getters e Setters
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }
    public void setSalario(double valor) {
        if (valor >= 0) {
            salario = valor;
        }
    }
}
