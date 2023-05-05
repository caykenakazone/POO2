package R3;

public class Main {
    public static void main(String[] args) {
        Veiculo c = new Carro("Volks","Fusca",1982);
        Veiculo m = new Moto("Honda","Biz",2020);
        Garagem g= new Garagem();

        g.estacionar(c);
        g.estacionar(m);
    }
}
