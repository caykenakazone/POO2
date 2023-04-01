package Ex10;

public class Vaca extends Mamifero {
    @Override
    public void comer() {
        System.out.println("A vaca está comendo capim.");
    }
    @Override
    public void dormir() {
        System.out.println("A vaca está dormindo em pé.");
    }
    public void mugir() {
        System.out.println("A vaca está mugindo.");
    }
}