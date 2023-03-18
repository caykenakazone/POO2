package Ex4;

public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta(0);
        Poupanca poupanca = new Poupanca(0, 1);

        conta.depositar(2000);
        conta.sacar(1000);
        poupanca.depositar(500);
        poupanca.sacar(200);

        System.out.println("Saldo da conta: " + conta.getSaldo());
        System.out.println("Saldo da poupança: " + poupanca.getSaldo());
    }
}

