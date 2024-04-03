package zoo;

public class Zoo 
{

    public static void main(String[] args) 
    {
        Cachorro dog1 = new Cachorro();
        Gato cat1 = new Gato();
        
        dog1.animalComFome();
        System.out.printf("\n");
        cat1.animalComFome();
        
    }
    
}
