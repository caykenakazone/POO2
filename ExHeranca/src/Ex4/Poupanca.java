package Ex4;


public class Poupanca extends Conta {
    protected int diaRendimento;

    public Poupanca(double saldo, int diaRendimento) {
        super(saldo);
        this.diaRendimento = diaRendimento;
    }

    @Override
    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            super.setSaldo(saldo);
        }
    }

    @Override
    public void sacar(double valor) {
        if (getSaldo() - valor >= 0) {
            super.sacar(valor);
        }
    }

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }
}
