package faculdade;

public abstract class Pessoa {
    protected String Nome, RG;
    protected int qtdFilhos;
    protected final double auxilioProcriacao = 100.00;

    public Pessoa(String Nome, String RG, int qtdFilhos) 
    {
        this.Nome = Nome;
        this.RG = RG;
        this.qtdFilhos = qtdFilhos;
    }
    
    public abstract double calcularSalario();
    public abstract void zerarMes();
    
    public void hollerith()
    {
        System.out.println("Nome: " + getNome());
        System.out.println("RG: " + getRG());
        System.out.println("Quantidade de filhos: " + getQtdFilhos());
    }

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
