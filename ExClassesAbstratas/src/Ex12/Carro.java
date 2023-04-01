package Ex12;

public class Carro extends Veiculo{
    public Carro(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    @Override
    public void ligar(){
        System.out.println("O carro ligou");

    }

    @Override
    public void desligar(){
        System.out.println("O carro desligou");
    }

}
