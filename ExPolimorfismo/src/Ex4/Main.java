package Ex4;

public class Main {
    public static void main(String[] args) {
        Funcionario as = new Assistente("Carlos", 1000);
        Funcionario ge = new Gerente("Ryann", 2000);
        Funcionario di = new Diretor("Gerson", 5000);

        System.out.println("Salário do assistente: " + as.calcularSalario());
        System.out.println("Salário do gerente: " + ge.calcularSalario());
        System.out.println("Salário do diretor: " + di.calcularSalario());
    }
}
