package Ex6;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(String numero, double saldo) {
        super(numero, saldo);
    }
    @Override
    public void verificarConta() {
        System.out.println("Verificando a conta poupança");
    }
}
