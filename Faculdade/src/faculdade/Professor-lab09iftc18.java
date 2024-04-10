package faculdade;

public class Professor extends Trabalhador
{ 
    private String Curso;
    private int qtdAula = 0;
    private double ganhoPorAula;
            
    public Professor(String Nome, String RG, int qtdFilhos, String Curso, double ganhoPorAula)
    {
        super(Nome, RG, qtdFilhos);
        this.Curso = Curso;
        this.ganhoPorAula = ganhoPorAula;
    }

    public String getCurso() 
    {
        return Curso;
    }

    public void setCurso(String Curso) 
    {
        this.Curso = Curso;
    }

    public int getQtdAula() 
    {
        return qtdAula;
    }

    public double getGanhoPorAula() 
    {
        return ganhoPorAula;
    }

    public void setGanhoPorAula(double ganhoPorAula)
    {
        this.ganhoPorAula = ganhoPorAula;
    }
    
    public void registraAulas(int qtdAula)
    {
        this.qtdAula = qtdAula;
    }
    
    @Override
    public double calcularSalario() 
    {
        return (qtdAula*ganhoPorAula)+ (getQtdFilhos()*auxilioProcriacao);
    }

    @Override
    public void hollerith() 
    {
        System.out.println("Nome: " + getNome());
        System.out.println("RG: " + getRG());
        System.out.println("Curso: " + getCurso());
        System.out.println("Quantidade de filhos: " + getQtdFilhos());
        System.out.println("Auxilio Procriacao: " + auxilioProcriacao);
        System.out.println("Aulas totais: " + getQtdAula());
        System.out.println("Ganho por aula: " + getGanhoPorAula());
        System.out.println("Salario total: " + calcularSalario());
        System.out.printf("\n");
    }

    @Override
    public void zerarMes() 
    {
        registraAulas(0);
    }

}
