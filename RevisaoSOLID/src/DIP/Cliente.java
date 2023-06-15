package DIP;

class Cliente {
    private Notificador notificador;

    public Cliente(Notificador notificador) {
        this.notificador = notificador;
    }

    public void realizarCompra() {
        // Lógica para realizar uma compra
        notificador.notificar();
    }
}
