package empresa;

public class Empresa 
{

    public static void main(String[] args) 
    {
        Vendedor v1 = new Vendedor("Marcos", 1234, 50);
        
        v1.vendeu(1000);
        v1.hollerith();
        
    }
    
}
