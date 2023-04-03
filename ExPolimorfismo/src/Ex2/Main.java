package Ex2;

public class Main {
    public static void main(String[] args) {
        Animal an = new Animal();
        Animal cn = new Cachorro();
        Animal gt = new Gato();
        Animal vc = new Vaca();
        an.emitirSom();
        cn.emitirSom();
        gt.emitirSom();
        vc.emitirSom();
    }
}
