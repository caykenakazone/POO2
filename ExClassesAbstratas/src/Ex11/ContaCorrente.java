package Ex11;


public class ContaCorrente extends Conta {
    private double taxa;

    public ContaCorrente(double saldo, double taxa) {
        super(saldo);
        this.taxa = taxa;
    }

    @Override
    public void sacar(double valor) {
        double valorComTaxa = valor + (valor * taxa / 100);
        super.sacar(valorComTaxa);
    }
}