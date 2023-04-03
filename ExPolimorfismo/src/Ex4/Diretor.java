package Ex4;

public class Diretor extends Funcionario {
    public Diretor(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    public double calcularSalario() {
        return salarioBase * 2.40;
    }
}
