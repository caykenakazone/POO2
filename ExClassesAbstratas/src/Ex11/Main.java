package Ex11;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ContaCorrente cc1 = new ContaCorrente(1000, 5);
        ContaCorrente cc2 = new ContaCorrente(2000, 3);
        ContaPoupanca cp1 = new ContaPoupanca(5000, 2);
        ContaPoupanca cp2 = new ContaPoupanca(8000, 1.5);
        ContaEspecial ce1 = new ContaEspecial(3000, 2000);
        List<Conta> contas = new ArrayList<>();
        contas.add(cc1);
        contas.add(cc2);
        contas.add(cp1);
        contas.add(cp2);
        contas.add(ce1);
        Banco banco = new Banco();
        banco.pagaJuros(contas);
        for (Conta conta : contas) {
            System.out.println("Saldo após juros: " + conta.getSaldo());
        }
    }
}
