package sistema_pedidos;

public class pedidoExistenteException extends RuntimeException {
    private String mensagem;

    public pedidoExistenteException(int pedido) {
        mensagem = "O pedido " + pedido + " já existe";
    }

    @Override
    public String toString() {
        return mensagem;
    }
}
