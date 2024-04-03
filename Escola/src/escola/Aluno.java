package escola;

public class Aluno {
    private String nome, ra;
    private int qtdAulas, faltas;
    
    //Contrutor
    
    public Aluno(String nome, String ra, int qtdAulas) 
    {
            setNome(nome);
            setRa(ra);
            setQtdAulas(qtdAulas);
            faltas = 0;
    }

    //Setters
    
    public final void setNome(String nome) 
    {
            if(nome.isBlank())
            {
                System.out.println("Nome inválido.");
            }
            else
            {
                this.nome = nome;
            }

    }

    public final void setRa(String ra) 
    {
            if(ra.isBlank())
            {
                System.out.println("RA inválido.");
            }
            else
            {
                this.ra = ra;
            }    
    }

    public final void setQtdAulas(int qtdAulas) 
    {
            if(qtdAulas < 0)
            {
                System.out.println("Quantidade de aulas inválida.");
            }
            else
            {
                this.qtdAulas = qtdAulas;
            }    
    }

    //Getters
    
    public String getNome() 
    {
        return nome;
    }

    public String getRa() 
    {
        return ra;
    }

    public int getQtdAulas() 
    {
        return qtdAulas;
    }

    public int getFaltas() 
    {
        return faltas;
    }

    
    //Outros métodos
    
    public void faltou()
    {
            faltas++;
    }
    
    public boolean aprovado()
    {
       return (faltas <= qtdAulas/4);
    }
    
    public void print()
    {
        System.out.println("Nome: " + nome + '\n');
        System.out.println("RA: " + ra + '\n');
        System.out.println("Aulas totais: " + qtdAulas + '\n');
        System.out.println("Faltas: " + faltas + '\n');
        System.out.println("Aprovado: " + (aprovado() ? "Sim" : "Não") + '\n');
        
    }
    
}
