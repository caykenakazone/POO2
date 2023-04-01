package Ex11;

public class ContaEspecial extends Conta {
    private double limite;

    public ContaEspecial(double saldo, double limite) {
        super(saldo);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }
}