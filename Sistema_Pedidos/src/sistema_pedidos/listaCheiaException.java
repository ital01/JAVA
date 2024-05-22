package sistema_pedidos;

public class listaCheiaException extends RuntimeException {
    private String mensagem;

    public listaCheiaException(int pedido) {
        mensagem = "O pedido " + pedido + " não foi cadastrado porque a lista de pedidos está cheia";
    }

    @Override
    public String toString() {
        return mensagem;
    }
}
