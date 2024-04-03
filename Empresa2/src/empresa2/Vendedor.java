package empresa2;

public class Vendedor extends Pessoa
{
    private double comissao, vendas;

    // Construtor
    //
    public Vendedor(String nome, String cpf, double comissao) 
    {
        super(nome, cpf);
        setComissao(comissao);
        vendas= 0;
    }

    // Setter
    //
    public final void setComissao(double comissao) 
    {
        if(comissao <= 0)
            System.out.println("Comissão inválida.");
        else
            this.comissao = comissao;
    }
    
    // Getters
    //
    public double getComissao() 
    {
        return comissao;
    }

    public double getVendas() 
    {
        return vendas;
    }
    
    // Outros métodos
    //
    public void vendeu(double valor)
    {
        vendas += valor;
    }
    
    @Override
    public double salarioLiquido()
    {
        return vendas * comissao/100;
    }
    
    @Override
    public void hollerith()
    {
        super.hollerith();
        System.out.printf("Total de vendas: %.2f", vendas);
        System.out.printf("Comissão: %.1f%% \n", comissao);
    }
}
