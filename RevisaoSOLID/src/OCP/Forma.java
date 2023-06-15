package OCP;

// Exemplo de extensão de uma classe sem modificá-la

abstract class Forma {
    abstract double calcularArea();
}

// Neste exemplo, a classe Forma está aberta para extensão através das classes Retangulo e Circulo, mas não precisa ser modificada quando novas formas são adicionadas.
