package Ex4;

public class Assistente extends Funcionario{
    public Assistente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    public double calcularSalario() {
        return salarioBase * 1.14;
    }
}
