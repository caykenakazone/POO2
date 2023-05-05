package R3;

public class Moto extends Veiculo{
    public Moto(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    @Override
    void ligar() {
        System.out.println("Moto ligou");
    }

    @Override
    void desligar() {
        System.out.println("Moto desligou");

    }
}
