package sistema_pedidos;

public class pedidoNaoEncontradoException extends Exception {
    private String mensagem;

    public pedidoNaoEncontradoException() {
        mensagem = "O pedido não foi encontrado";
    }
    
    public pedidoNaoEncontradoException(int pedido) {
        mensagem = "O pedido " + pedido + " não encontrado";
    }

    @Override
    public String toString() {
        return mensagem;
    }
}
