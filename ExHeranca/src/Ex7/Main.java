package Ex7;

public class Main {

    public static void main(String[] args) {

    /*A sobrecarga dos metodos é um conceito de polimorfismo que consiste em criar diferentes formas
    do mesmo metodo, ou seja, a criação de dois ou mais metodos com nomes iguais em uma classe,
    A Sobrecarga permite que utilizemos o mesmo nome em mais de um método contanto que suas listas de
    argumentos sejam diferentes para que seja feita a separação dos mesmos.
    Como nesse exemplo onde os dois somam, porem um em int e outro em double e com mais atributos.*/
    }

    public int soma(int a, int b) {
        return a + b;
    }

    public double soma(double a, double b, double c) {
        return a + b + c;
    }
}


