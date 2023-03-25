package Ex3;

public class Moto extends Veiculo{
    private int velocidade;
    public Moto(int velocidade) {
        super(velocidade);
        this.velocidade=velocidade;
    }
    @Override
    public void acelerar(){

        System.out.println("Veiculo acelerando a "+velocidade+" Km/h");
    }
}
