package Ex10;

public class Gato extends Mamifero {
    @Override
    public void comer() {
        System.out.println("O gato está comendo ração de gato.");
    }
    @Override
    public void dormir() {
        System.out.println("O gato está dormindo em cima do sofá.");
    }
    public void miar() {
        System.out.println("O gato está miando.");
    }
}