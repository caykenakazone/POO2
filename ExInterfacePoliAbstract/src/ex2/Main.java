package ex2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<CartaoWeb> cartoes = new ArrayList<>();
        cartoes.add(new DiaDosNamorados("Carlos"));
        cartoes.add(new Natal("Cayke"));
        cartoes.add(new Aniversario("Ryann"));

        for(CartaoWeb cr : cartoes){
            cr.showMessage();
        }

        /*
        O polimorfismo acontece quando a Lista de cartoes é criada e também quando, dentro do laço for, o método showMessage é chamado
         */
    }
}
