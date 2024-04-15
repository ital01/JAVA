package tecelagem;

public class ListaFuncionarios 
{
    Funcionario Lista[];
    private int count;
    
    public ListaFuncionarios(int capMax)
    {
        Lista = new Funcionario[capMax];
        count = 0;
    }    
    
    public boolean add(Funcionario f)
    {
        if(count>=Lista.length)
        {
            System.out.println("Erro ao adicionar " + f.getNome() + ", limite de pessoas atingido \n");
            return false;
        }
        
        Lista[count] = f;
        count++;
        
        return true;
    }
    
    public boolean registrarVenda(int index, double valor)
    {
        if(Lista[index] instanceof Vendedor)
        {
            Vendedor vend1 = (Vendedor)Lista[index];
            vend1.registrarVenda(valor);
            return true;
        }
        return false;
    }
    
    public boolean registrarFalta(int index)
    {
        if(Lista[index] instanceof Administrativo)
        {
            Administrativo adm1 = (Administrativo)Lista[index];
            adm1.registrarFalta();
            return true;
        }
        return false;
    }
    
    public boolean registrarHorasDiurnas(int index, int horas)
    {
        if(Lista[index] instanceof Producao)
        {
            Producao prod1 = (Producao)Lista[index];
            prod1.registrarHorasDiurnas(horas);
            return true;
        }
        return false;
    }
    
    public boolean registrarHorasNoturnas(int index, int horas)
    {
        if(Lista[index] instanceof Producao)
        {
            Producao prod1 = (Producao)Lista[index];
            prod1.registrarHorasNoturnas(horas);
            return true;
        }
        return false;
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
