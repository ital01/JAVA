package sistema_pedidos;

public class Sistema_Pedidos 
{

    public static void main(String[] args)
    {
        Pedido p1 = new Pedido(1,1,1,1.11);
        Pedido p2 = new Pedido(2,2,2,2.22); 
        Pedido p3 = new Pedido(5,5,5,5.55);
        Pedido p4 = new Pedido(6,6,6,6.66);
        Pedido p5 = new Pedido(7,7,7,7.77);
        
        ListaPedidos L1 = new ListaPedidos(3);
        
        try
        {
        L1.cadastrarPedido(p1);
        L1.cadastrarPedido(p2);
        L1.cadastrarPedido(p3);
        L1.cadastrarPedido(p4);
        L1.cadastrarPedido(p5); 
        }
        catch(listaCheiaException | pedidoExistenteException e)
        {
            System.out.println(e);
        }
    }
    
}