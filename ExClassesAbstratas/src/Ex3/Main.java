package Ex3;

public class Main {
    public static void main(String[] args) {
        Veiculo carro = new Carro();
        Veiculo moto = new Moto();
        Veiculo caminhao = new Caminhao();

        carro.acelerar(60);
        moto.acelerar(50);
        caminhao.acelerar(40);
    }
}
