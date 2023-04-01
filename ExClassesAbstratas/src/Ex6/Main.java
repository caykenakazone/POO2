package Ex6;

public class Main {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente("3242",5000.0);
        Conta cp = new ContaPoupanca("6666",6000.0);


        cc.verificarConta();
        cp.verificarConta();
    }
}
