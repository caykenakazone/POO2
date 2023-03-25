package Ex3;

public class Caminhao extends Veiculo{
    private int velocidade;

    public Caminhao(int velocidade) {
        super(velocidade);
        this.velocidade = velocidade;
    }

    @Override
    public void acelerar(){
        System.out.println("Veiculo acelerando a "+velocidade+" Km/h");
    }
}
