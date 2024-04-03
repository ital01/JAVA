package tecelagem;

public class Vendedor extends Funcionario 
{
    private double vendas;
    private final double comissao;
    
    public Vendedor(String nome, String rg, double salarioBase) 
    {
        super(nome, rg, salarioBase);
        vendas = 0;
        comissao = 3;
    }

    public double getVendas() 
    {
        return vendas;
    }

    public double getComissao() 
    {
        return comissao;
    }
    
    public final void registrarVenda(double valor)
    {
        vendas+=valor;
    }

    @Override
    public double salarioLiquido() 
    {
        return ( getSalarioBase() + (getVendas()*getComissao()/100.0) );
    }

    @Override
    public void novoMes() 
    {
        vendas = 0;
    }
    
    @Override
     public void hollerith( )
    {
        super.hollerith();
        System.out.printf("Vendas totais: %.2f R$ \n", getVendas());
        System.out.printf("Comissao: %.1f%% \n", getComissao());
        System.out.printf("\n");
    }
}