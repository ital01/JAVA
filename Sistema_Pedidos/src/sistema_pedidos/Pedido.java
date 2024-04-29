package sistema_pedidos;

public class Pedido 
{
    private int numPedido, codCliente, codVendedor;
    private double valor;
    private boolean estadoVenda, estadoAtendimento;

    public Pedido(int numPedido, int codCliente, int codVendedor, double valor) 
    {
        this.numPedido = numPedido;
        this.codCliente = codCliente;
        this.codVendedor = codVendedor;
        this.valor = valor;
        estadoVenda = false;
        estadoAtendimento = false;
    }

    public int getNumPedido() 
    {
        return numPedido;
    }

    public int getCodCliente() 
    {
        return codCliente;
    }

    public int getCodVendedor() 
    {
        return codVendedor;
    }

    public double getValor() 
    {
        return valor;
    }

    public boolean isEstadoVenda()
    {
        return estadoVenda;
    }

    public boolean isEstadoAtendimento()
    {
        return estadoAtendimento;
    }

    public void setNumPedido(int numPedido) 
    {
        this.numPedido = numPedido;
    }

    public void setCodCliente(int codCliente)
    {
        this.codCliente = codCliente;
    }

    public void setCodVendedor(int codVendedor)
    {
        this.codVendedor = codVendedor;
    }

    public void setValor(double valor)
    {
        this.valor = valor;
    }
    
    public void realizarVenda()
    {
        estadoVenda = true;
    }
    
    public void realizarAtendimento()
    {
        estadoAtendimento = true;
    }
    
    public void print()
    {
        System.out.println("Numero do pedido: " + getNumPedido());
        System.out.println("Codigo do cliente: " + getCodCliente());
        System.out.println("Codigo do vendedor: " + getCodVendedor());
        System.out.println("Valor: " + getValor());
        System.out.println("Estado da venda" + (isEstadoVenda() ? "Vendido" : "Nao vendido"));
        System.out.println("Estado do atendimento" + (isEstadoAtendimento() ? "Atendido" : "Nao atendido"));
        System.out.println("\n");
    }
}
