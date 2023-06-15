package DIP;

// Exemplo de dependência em relação a abstrações

interface Notificador {
    void notificar();
}

// Neste exemplo, a classe Cliente depende da abstração Notificador
// em vez de depender diretamente das implementações concretas, permitindo que diferentes
// notificadores sejam injetados no cliente.

