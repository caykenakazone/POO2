package Ex11;

import java.util.List;

public class Banco {
    public void pagaJuros(List<Conta> contas) {
        for (Conta conta : contas) {
            if (conta instanceof ContaPoupanca) {
                ContaPoupanca poupanca = (ContaPoupanca) conta;
                poupanca.aplicarJuros();
            }
        }
    }
}

