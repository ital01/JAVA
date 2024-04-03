package empresa2;

public class Funcionario extends Pessoa
{
    private double salario;
    private int faltas;
    
    // Construtor
    //
    public Funcionario(String nome, String cpf, double salario)
    {
        super(nome, cpf);
        
        setSalario(salario);
        faltas= 0;
    }
    
    // Setter
    //
    public final void setSalario(double salario)
    {
        if(salario <= 0)
            System.out.println("Salário inválido.");
        else
            this.salario= salario;
    }

    // Getters
    //
    public double getSalario() 
    {
        return salario;
    }

    public int getFaltas() 
    {
        return faltas;
    }
    
    // Outros métodos
    //
    public void faltou()
    {
        faltas++;
    }
    
    @Override
    public double salarioLiquido()
    {
        return salario - (salario/20)*faltas;
    }
    
    
    @Override
    public void hollerith()
    {
        super.hollerith();
         System.out.printf("Salário bruto: %.2f", salario);
         System.out.printf("Faltas: %d\n", faltas);
    }
    
}
