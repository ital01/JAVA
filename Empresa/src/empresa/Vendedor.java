package empresa;

public class Vendedor 
{
    private String nome;
    private int codigo;
    private double totalVendas, porcentagem;
    
    
    
    
    public Vendedor(String nome, int codigo, double porcentagem) 
    {
        this.nome = nome;
        this.codigo = codigo;
        this.porcentagem = porcentagem;
    }
    
    
    
    
    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public void setCodigo(int codigo) 
    {
        this.codigo = codigo;
    }

    public void setPorcentagem(double porcentagem) 
    {
        this.porcentagem = porcentagem;
    }
    
    
    
    
    public String getNome()
    {
        return nome;
    }

    public int getCodigo() 
    {
        return codigo;
    }

    public double getTotalVendas() 
    {
        return totalVendas;
    }

    public double getPorcentagem() 
    {
        return porcentagem;
    }
    
    
    
    
    public void vendeu(double valor)
    {
        totalVendas = valor;
    }

    public double salario()
    {
       return totalVendas*(porcentagem/100);
    }
    
    public void hollerith()
    {
        System.out.println("Nome: " + nome);
        System.out.println("Codigo: " + codigo);
        System.out.println("Vendas Totais: " + totalVendas);
        System.out.println("Comissao por produto: " + porcentagem+"%");
        System.out.println("Salario: " + salario() + " R$");
        vendeu(0);
    }
    
}
