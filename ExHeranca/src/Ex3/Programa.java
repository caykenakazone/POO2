package Ex3;

public class Programa {

    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("Carlos", "Nakazone");

        Funcionario pessoa2 = new Funcionario("Ryann", "Messias", 100, 1000.00);

        Professor pessoa3 = new Professor("Gerson", "Silva", 200, 1500.00);


        System.out.println("Nome completo da pessoa1: " + pessoa1.getNomeCompleto());
        System.out.println("Nome completo da pessoa2: " + pessoa2.getNomeCompleto());
        System.out.println("Nome completo da pessoa3: " + pessoa3.getNomeCompleto());


        System.out.println("\n\nPrimeira parcela do salário da pessoa2: " + pessoa2.getSalarioPrimeiraParcela());
        System.out.println("Segunda parcela do salário da pessoa2: " + pessoa2.getSalarioSegundaParcela());

        System.out.println("\n\nPrimeira parcela do salário da pessoa3: " + pessoa3.getSalarioPrimeiraParcela());
        System.out.println("Segunda parcela do salário da pessoa3: " + pessoa3.getSalarioSegundaParcela());
    }
}
