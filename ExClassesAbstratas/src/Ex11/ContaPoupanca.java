package Ex11;

import java.util.List;

public class ContaPoupanca extends Conta {
    private double taxaJuros;

    public ContaPoupanca(double saldo, double taxaJuros) {
        super(saldo);
        this.taxaJuros = taxaJuros;
    }

    public void aplicarJuros() {
        double juros = getSaldo() * taxaJuros / 100;
        super.sacar(-juros);
    }
}
