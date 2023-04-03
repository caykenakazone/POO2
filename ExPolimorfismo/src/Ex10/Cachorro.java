package Ex10;

public class Cachorro extends Mamifero {
    @Override
    public void comer() {
        System.out.println("O cachorro está comendo ração.");
    }
    @Override
    public void dormir() {
        System.out.println("O cachorro está dormindo em sua casinha.");
    }
    public void latir() {
        System.out.println("O cachorro está latindo.");
    }
}