package tecelagem;

public abstract class Funcionario 
{
    private String nome, rg;
    private double salarioBase;

    public Funcionario(String nome, String rg, double salarioBase) 
    {
        setNome(nome);
        setRg(rg);
        setSalarioBase(salarioBase);
    }

    public String getNome() 
    {
        return nome;
    }

    public final void setNome(String nome) 
    {
        this.nome = nome;
    }

    public String getRg() 
    {
        return rg;
    }

    public final void setRg(String rg) 
    {
        this.rg = rg;
    }

    public double getSalarioBase() 
    {
        return salarioBase;
    }

    public final void setSalarioBase(double salarioBase) 
    {
        this.salarioBase = salarioBase;
    }
    
    public abstract double salarioLiquido();
    public abstract void novoMes( );
    
    public void hollerith( )
    {
        System.out.println("Nome: " + getNome());
        System.out.println("RG: " + getRg());
        System.out.printf("Salario Base: %.2f R$ \n", getSalarioBase() );
        System.out.printf("Salario Liquido: %.2f R$ \n", salarioLiquido() );    
    }
}
