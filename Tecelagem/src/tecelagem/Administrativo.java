package tecelagem;

public class Administrativo extends Funcionario
{
    private int faltas;
    
    public Administrativo(String nome, String rg, double salarioBase) 
    {
        super(nome, rg, salarioBase);
        faltas = 0;
    }

    public int getFaltas() 
    {
        return faltas;
    }

    @Override
    public double salarioLiquido() 
    {
        return ( getSalarioBase() - (getSalarioBase()*(getFaltas()/30.0)) );
    }

    @Override
    public void novoMes() 
    {
       faltas = 0;
    }
    
    public void registrarFalta( )
    {
        if(faltas == 30)
        {
            System.out.printf("Limite de faltas atingido!! (30 faltas)\n\n");
            faltas = 30;
        }
        faltas++;
    }
    
    @Override
    public void hollerith( )
    {
        super.hollerith();
        System.out.println("Faltas: " + getFaltas());
        System.out.printf("\n");
    }
}