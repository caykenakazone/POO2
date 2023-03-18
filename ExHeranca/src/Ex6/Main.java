package Ex6;

public class Main {
    public static void main(String[] args) {
        /*A sobrescrita de método (ou overriding) ocorre quando uma subclasse redefine (sobrescreve)
        um método da superclasse, com a mesma assinatura (nome e parâmetros) e tipo de retorno. */
        Animal animal = new Animal();
        Cachorro cachorro = new Cachorro();

        animal.emitirSom();
        cachorro.emitirSom();
    }
}
