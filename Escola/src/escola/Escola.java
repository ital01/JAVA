package escola;

public class Escola 
{

    public static void main(String[] args) 
    {
        Aluno a1 = new Aluno("Joca", "123-4", 10);
        for(int i=0;i<4;i++){a1.faltou();}

        a1.print();
    }
    
}
