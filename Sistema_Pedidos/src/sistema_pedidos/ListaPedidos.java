package sistema_pedidos;

public class ListaPedidos 
{
    private Pedido Lista[];
    private int count;
    
    public ListaPedidos(int capMax)
    {
        Lista = new Pedido[capMax];
        count = 0;
    }

     public Pedido buscarPedido(int numPed)
     {
         for(int i = 0; i<=numPed; i++)
         {
            if(Lista[i].getNumPedido() == numPed)
            {
                return Lista[i];
            }
         }
         return null;
     }
     
     public boolean cadastrarPedido(Pedido p)
     {
        if(count>=Lista.length)
        {
            System.out.println("Erro ao criar pedido, limite de pedidos atingido");
            return false;
        }
        
        Lista[count] = p;
        count++;
        
        return true;
     }
    
     public void atenderPedido(int numPed)
     {
        if(buscarPedido(numPed) != null)
        {
            Lista[numPed].realizarAtendimento();
        }
        else
        {
            System.out.println("Pedido não existe");
        }
     }
     
     public void relatorioCliente(int codCli, boolean todos, boolean atendidos)
     {
         
     }
}
