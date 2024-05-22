package sistema_pedidos;

public class pedidoPagoException extends Exception {
    private String mensagem;

    public pedidoPagoException(int pedido) {
        mensagem = "O pedido " + pedido + " já foi pago";
    }

    @Override
    public String toString() {
        return mensagem;
    }
}
