public class Gerente extends Funcionario{
    public Gerente(String nome, String matricula, double salario_base) {
        super(nome, matricula, salario_base);
    }

    @Override
    double calculaSalario() {
        double salario;
        return salario = getSalario_base()*2;
    }

}
