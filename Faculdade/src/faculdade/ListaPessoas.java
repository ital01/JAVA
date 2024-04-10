package faculdade;

public class ListaPessoas
{
    private Pessoa Lista[];
    private int count;
    
    public ListaPessoas(int capMax)
    {
        Lista = new Pessoa[capMax];
        count = 0;
    }
    
    public boolean add(Pessoa p)
    {
        if(count>=Lista.length)
        {
            System.out.println("Erro ao adicionar " + p.getNome() + ", limite de pessoas atingido \n");
            return false;
        }
        
        Lista[count] = p;
        count++;
        
        return true;
    }
    
    public void Listagem()
    {
        for(int i=0; i<count; i++)
        {
            Lista[i].hollerith();
            System.out.println("");
        }
    }
    
}