package R3;

public class Carro extends Veiculo{
    public Carro(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    @Override
    void ligar() {
        System.out.println("Carro ligou");
    }

    @Override
    void desligar() {
        System.out.println("Carro desligou");
    }
}
