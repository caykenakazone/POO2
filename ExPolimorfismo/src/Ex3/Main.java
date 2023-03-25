package Ex3;

public class Main {
    public static void main(String[] args) {
        Veiculo v = new Veiculo(10);
        Veiculo cr = new Carro(136);
        Veiculo mt = new Moto(83);
        Veiculo cm = new Caminhao(40);
        v.acelerar();
        cr.acelerar();
        mt.acelerar();
        cm.acelerar();
    }
}
