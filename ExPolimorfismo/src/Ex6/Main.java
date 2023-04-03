package Ex6;

public class Main {
    public static void main(String[] args) {
        Conta c = new Conta("1234",1000.0);
        Conta cc = new ContaCorrente("3242",5000.0);
        Conta cp = new ContaPoupanca("6666",6000.0);

        c.verificarConta();
        cc.verificarConta();
        cp.verificarConta();
    }
}
