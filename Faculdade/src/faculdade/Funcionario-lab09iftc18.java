package faculdade;

public class Funcionario extends Trabalhador
{
    private String Departamento;
    private double Salario;
    private final double valeCoxinha = 42.00;
    private int faltas = 0;
    
    public Funcionario(String Nome, String RG, int qtdFilhos, String Departamento, double Salario) 
    {
        super(Nome, RG, qtdFilhos);
        this.Departamento = Departamento;
        this.Salario = Salario;
    }

    public String getDepartamento() 
    {
        return Departamento;
    }

    public void setDepartamento(String Departamento) 
    {
        this.Departamento = Departamento;
    }

    public double getSalario() 
    {
        return Salario;
    }
    
    public void registraFalta()
    {
        if(faltas>=20)
        { 
        faltas = 20;
        }
        else
        {
        faltas++;
        }
    }

    @Override
    public double calcularSalario() 
    {
        return (getSalario() - (getSalario()*faltas/20)) + (auxilioProcriacao*getQtdFilhos()) + valeCoxinha;
    }

    @Override
    public void hollerith() 
    {
        System.out.println("Nome: " + getNome());
        System.out.println("RG: " + getRG());
        System.out.println("Departamento: " + getDepartamento());
        System.out.println("Quantidade de filhos: " + getQtdFilhos());
        System.out.println("Auxilio Procriacao: " + auxilioProcriacao);
        System.out.println("Vale Coxinha: " + valeCoxinha);
        System.out.println("Faltas totais: " + faltas);
        System.out.println("Salario: " + getSalario());
        System.out.println("Salario final: " + calcularSalario());
        System.out.printf("\n");
    }

    @Override
    public void zerarMes() 
    {
        faltas = 0;
    }
    
}
