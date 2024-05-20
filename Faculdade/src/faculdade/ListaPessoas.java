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
//        if(count>=Lista.length)
//        {
//            System.out.println("-------------------------------------------------------------");
//            System.out.println("Erro ao adicionar " + p.getNome() + ", limite de pessoas atingido");
//            System.out.println("-------------------------------------------------------------\n");
//
//            return false;
//        }
//        
//        Lista[count] = p;
//        count++;
       
        try
        {
            Lista[count] = p;
            count++;
        }
        catch(ArrayIndexOutOfBoundsException  e)
        {
            System.out.println("--------------------------------------------------------------------------------------------------------------------------");
            System.out.println("Erro ao adicionar " + p.getNome() + ", limite de pessoas atingido");
            System.out.println("--------------------------------------------------------------------------------------------------------------------------\n");
            e.printStackTrace();
            return false;
        }
        
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