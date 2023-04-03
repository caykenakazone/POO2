package Ex11;

public class ContaEspecial extends Conta {
    private double limiteCredito;

    public ContaEspecial(int numero, double saldo, double limiteCredito) {
        super(numero, saldo);
        this.limiteCredito = limiteCredito;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= (getSaldo() + limiteCredito)) {
            setSaldo(getSaldo() - valor);
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    // getters e setters
    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }
}