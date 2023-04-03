package Ex12;

public class Moto extends Veiculo{

    public Moto(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    @Override
    public void ligar(){
        System.out.println("A moto ligou");

    }

    @Override
    public void desligar(){
        System.out.println("A moto desligou");
    }
}
