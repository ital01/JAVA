package empresa2;

public class Empresa2 {

    public static void main(String[] args) 
    {
        Funcionario f1= new Funcionario("Zé", "12345678-9", 10000);
        f1.faltou();
        f1.faltou();
        f1.hollerith();
        System.out.println();
        
        Vendedor v1= new Vendedor("Joca", "123456354-9", 5);
        v1.vendeu(50000);
        v1.vendeu(50000);
        v1.hollerith();
        
        
    }
    
}
