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
}
