package sistema_pedidos;

public class Pedido 
{
    private int numPed, codCli, codVend;
    private double valor;
    private boolean atendido, pago;
    
    // Construtor

    public Pedido(int numPed, int codCli, int codVend, double valor) 
    {
        this.numPed = numPed;
        this.codCli = codCli;
        this.codVend = codVend;
        this.valor = valor;
        atendido= false;
        pago= false;
    }
    
    // Setters
    public void setNumPed(int numPed) 
    {
        this.numPed = numPed;
    }

    public void setCodCli(int codCli) 
    {
        this.codCli = codCli;
    }

    public void setCodVend(int codVend) 
    {
        this.codVend = codVend;
    }

    public void setValor(double valor) 
    {
        this.valor = valor;
    }

    // Getters
    public int getNumPed() 
    {
        return numPed;
    }

    public int getCodCli() 
    {
        return codCli;
    }

    public int getCodVend() 
    {
        return codVend;
    }

    public double getValor() 
    {
        return valor;
    }

    public boolean isAtendido() 
    {
        return atendido;
    }

    public boolean isPago() 
    {
        return pago;
    }
    
    // Outros
    public boolean atender()
    {
        if(atendido) 
        {
            System.out.println("Pedido já atendido!!!");
            return false; 
        }
        
        atendido= true;
        return true;
    }
    
    public boolean pagar()
    {
        if(!atendido)
        {
            System.out.println("Este pedido não foi atendido ainda!!!");
            return false;
        }
        if(pago)
        {
            System.out.println("Este pedido já foi pago!!!");
            return false;
        }
        pago= true;
        return true;
    }
    
    
    // Um método static é um método de classe, não de instancia. Pode ser chamado
    // diretamente a partir da classe, mas não pode usar atributos e 
    // métodos de instancia.
    //
    public static void printCols()
    {
        System.out.printf("| %5s | %5s | %5s | %7s |\n", "N.Ped", "C.Cli", "CVend", "Valor");
    }
    
    public void printPed()
    {
        System.out.printf("| %5d | %5d | %5d | %7.2f |\n", numPed, codCli, codVend, valor);
    }
    
}
