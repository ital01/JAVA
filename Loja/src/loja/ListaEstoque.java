package loja;

public class ListaEstoque //implements ItemEstoqueInt
{
    private Roupa r1[];
    private int capacidade, contador;

    public ListaEstoque(Roupa[] r1, int capacidade) 
    {
        this.r1 = r1;
        this.capacidade = capacidade;
        contador = 0;
    }

    public int add(ItemEstoqueInt item)
    {
         if(contador>=r1.length)
        {
            System.out.println("Limite atingido!!");
            return -1;
        }
         
         r1[contador] = (Roupa) item;
         contador++;
         return (contador - 1);
    }
    
    public boolean incUnits(int index, int qtd)
    {
        int qtdEstoque = r1[index].getUnits();
        boolean condicao;
        
        r1[index].incUnits(qtd);
        
        condicao = r1[index].getUnits() == (qtdEstoque + qtd);
        
        if(condicao)
        {
            return true;
        }
        return false;
    }
    
    public boolean decUnits(int index, int qtd)
    {
        int qtdEstoque = r1[index].getUnits();
        boolean condicao = qtdEstoque > qtd;
        
        if(condicao)
        {
            r1[index].decUnits(qtd);
            return true;
        }
        
        return false;
    }
    
    public void listAll()
    {
        for (Roupa r2 : r1) 
        {
            r2.print();
            System.out.printf("\n");
        }
    }
    
}
