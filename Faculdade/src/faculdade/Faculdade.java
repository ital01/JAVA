package faculdade;

public class Faculdade 
{

    public static void main(String[] args) 
    {
        Professor prof1 = new Professor("Joao", "1212121-99", 3, "ADS", 50);
        
        Funcionario func1 = new Funcionario("Maria", "34343434-56", 5, "RH", 4565.87);
        
        prof1.registraAulas(50);
        //prof1.hollerith();
        
        prof1.zerarMes();
        prof1.hollerith();

        
        
        for(int i = 0; i<26; i++)
        func1.registraFalta();
        //func1.hollerith();
        
        func1.zerarMes();
        func1.hollerith();

        
    }
    
}
