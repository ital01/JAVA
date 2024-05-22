package sistema_pedidos;

public class pedidoAtendidoException extends Exception {
    private String mensagem;

    public pedidoAtendidoException(int pedido) {
        mensagem = "O pedido " + pedido + " já foi atendido";
    }

    @Override
    public String toString() {
        return mensagem;
    }
}
