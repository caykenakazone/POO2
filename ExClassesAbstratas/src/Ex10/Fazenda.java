package Ex10;

import java.util.List;

public class Fazenda {
    public void alimentarAnimais(List<Animal> animais) {
        for (Animal animal : animais) {
            animal.comer();
        }
    }
}