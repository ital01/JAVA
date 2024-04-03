package empresa2;

public abstract class Pessoa 
{
    private String nome, cpf;

    // Construtor
    //
    public Pessoa(String nome, String cpf)
    {
        setNome(nome);
        setCpf(cpf);
    }
    
    // Setters
    //
    public final void setNome(String nome) 
    {
        if(nome.isBlank())
            System.out.println("Nome inválido.");
        else
            this.nome = nome;
    }

    public final void setCpf(String cpf) 
    {
        if(cpf.isBlank())
            System.out.println("CPF inválido.");
        else
            this.cpf = cpf;
    }
    
    // Getters
    //
    public String getNome() 
    {
        return nome;
    }

    public String getCpf() 
    {
        return cpf;
    }
    
    public double salarioLiquido()
    {
        return 0 ;
    }
    
    public void hollerith()
    {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf );
        System.out.println("Salario Liquido: " + salarioLiquido());

    }
}
