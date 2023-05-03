import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Funcionario> lista = new ArrayList<>();
        lista.add(new Assistente("Cayke", "12345",1500));
        lista.add(new Gerente("Carlos", "43215", 2000));
        lista.add(new Vendedor("Ryann", "5643", 1500, 200));

        double totalSalario = 0;
        for(Funcionario f : lista){
            System.out.println(f.calculaSalario());
            totalSalario+=f.calculaSalario();
        }
        System.out.println("Folha salarial: "+totalSalario);

        /*
            Nesta parte 1 do ex, foram usados os conceitos de Classes Abstratas, que tem a
            classe Funcionario, que possui um método abstrato calculaSalario(), e que serve
            como base para as outras classes representativas dos tipos de funcionários.

            Herança: as classes Gerente, Assistente e Vendedor estendem a classe abstrata
            Funcionario, herdando seus atributos e métodos.

            Polimorfismo: na classe Teste, foi criada uma lista do tipo Funcionario, que pode armazenar objetos das classes
            Gerente, Assistente e Vendedor. Ao chamar o método calculaSalario() em cada um desses objetos,
            o método sobrescrito correspondente é executado, de acordo com o tipo de funcionário.

            Encapsulamento: os atributos nome, matricula e salario_base da classe Funcionario
            foram declarados como privados e são acessados por meio de métodos getters e setters.
            Isso protege esses atributos de acessos não autorizados e ajuda a garantir a
            consistência dos dados.
         */
    }
}