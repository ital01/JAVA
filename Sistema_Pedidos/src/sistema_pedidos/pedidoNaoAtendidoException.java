package sistema_pedidos;

public class pedidoNaoAtendidoException extends Exception {
    private String mensagem;

    public pedidoNaoAtendidoException(int pedido) {
        mensagem = "O pedido " + pedido + " não foi atendido";
    }

    @Override
    public String toString() {
        return mensagem;
    }
}
