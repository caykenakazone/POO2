package Ex11;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Conta> contas;

    public Banco() {
        contas = new ArrayList<>();
    }

    public void addConta(Conta conta) {
        contas.add(conta);
    }

    public void pagaJuros() {
        for (Conta conta : contas) {
            if (conta instanceof ContaPoupanca) {
                ContaPoupanca contaPoupanca = (ContaPoupanca) conta;
                contaPoupanca.adicionaJuros();
            }
        }
    }
}

