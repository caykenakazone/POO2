package R1;

public class Main {
    public static void main(String[] args) {
        Funcionario a = new Assistente("Carla", "123",2000);
        Funcionario g = new Gerente("Marcos","543",4000);
        Funcionario v = new Vendedor("Marcolas","654",5000,0.1);

        System.out.println(a.calculaSalario());
        System.out.println(g.calculaSalario());
        System.out.println(v.calculaSalario());
    }
}
