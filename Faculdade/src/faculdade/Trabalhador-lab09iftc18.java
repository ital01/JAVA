package faculdade;

public abstract class Trabalhador 
{
    protected String Nome, RG;
    protected int qtdFilhos;
    protected final double auxilioProcriacao = 100.00;

    public Trabalhador(String Nome, String RG, int qtdFilhos) 
    {
        this.Nome = Nome;
        this.RG = RG;
        this.qtdFilhos = qtdFilhos;
    }
    
    public abstract double calcularSalario();
    public abstract void hollerith();
    public abstract void zerarMes();

    public String getNome() 
    {
        return Nome;
    }

    public String getRG() 
    {
        return RG;
    }

    public int getQtdFilhos() 
    {
        return qtdFilhos;
    }

    
}
