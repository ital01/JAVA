package exceptions;

public class Exceptions 
{

    public static void main(String[] args) 
    {
        int a = 10;
        int b = 0;
        int r = 0;        
        
        int vet[] = new int[10];
        
        try{
            vet[11] = 20;
            r = a/b;  
        }
        catch(ArithmeticException exc){
            System.out.println("Divisao por 0 é indeterminada!");
        }
        catch(Exception exc){
            System.out.println(exc);
        }
        
        System.out.println("r =  " + r);
    }
    
}
