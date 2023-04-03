package Ex11;

public class ContaCorrente extends Conta {
    private double taxaSaque;

    public ContaCorrente(int numero, double saldo, double taxaSaque) {
        super(numero, saldo);
        this.taxaSaque = taxaSaque;
    }

    @Override
    public void sacar(double valor) {
        double valorComTaxa = valor + (valor * taxaSaque);
        if (valorComTaxa <= getSaldo()) {
            setSaldo(getSaldo() - valorComTaxa);
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    // getters e setters
    public double getTaxaSaque() {
        return taxaSaque;
    }

    public void setTaxaSaque(double taxaSaque) {
        this.taxaSaque = taxaSaque;
    }
}