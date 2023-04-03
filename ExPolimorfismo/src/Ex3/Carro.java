package Ex3;

public class Carro extends Veiculo{
    private  int velocidade;
    public Carro(int velocidade) {
        super(velocidade);
        this.velocidade = velocidade;
    }
    @Override
    public void acelerar(){
        System.out.println("Veiculo acelerando a "+velocidade+" Km/h");
    }
}
