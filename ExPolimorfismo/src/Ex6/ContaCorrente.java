package Ex6;

public class ContaCorrente extends Conta {
    public ContaCorrente(String numero, double saldo) {
        super(numero, saldo);
    }
    @Override
    public void verificarConta() {
        System.out.println("Verificando a conta corrente");
    }
}