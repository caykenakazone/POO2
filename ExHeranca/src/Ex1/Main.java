package Ex1;

public class Main {
    public static void main(String[] args) {
        C c = new C();

        /*Explicação dos resultados*/

        /*Isso ocorre pois a Classe C herda da classe A, e quando o objeto da  classe C é criado no main, o construtor da classe A é chamado e Imprime
        a menssagem, e alem disso a classe C tem o atributo do tipo B, que é instanciado quando é declarado, chamando o construtor B
        que imprime a segunda mensagem na tela*/

    }
}