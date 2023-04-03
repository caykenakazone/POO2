package Ex11;

public class ContaPoupanca extends Conta {
    private double taxaJuros;

    public ContaPoupanca(int numero, double saldo, double taxaJuros) {
        super(numero, saldo);
        this.taxaJuros = taxaJuros;
    }

    public void adicionaJuros() {
        setSaldo(getSaldo() + (getSaldo() * taxaJuros));
    }

    // getters e setters
    public double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }
}
