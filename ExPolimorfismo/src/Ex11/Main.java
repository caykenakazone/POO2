package Ex11;

public class Main {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(2324,2500.00,10);
        ContaPoupanca cp = new ContaPoupanca(3244,4500.00,20);
        ContaEspecial ce = new ContaEspecial(1245,23500.00,3);

        Banco bc = new Banco();
        bc.addConta(cc);
        bc.addConta(cp);
        bc.addConta(ce);

        bc.pagaJuros();
    }
}
