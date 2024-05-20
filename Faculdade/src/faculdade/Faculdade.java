package faculdade;

public class Faculdade 
{

    public static void main(String[] args) 
    {
        Professor prof1 = new Professor("Joao", "1212121-99", 3, "ADS", 50);
        Professor prof2 = new Professor("Cleber", "324234323-asd", 6, "SI", 90);
        
        Funcionario func1 = new Funcionario("Maria", "34343434-56", 5, "RH", 4565.87);

        ListaPessoas lista1 = new ListaPessoas(3);

        lista1.add(prof1);
        lista1.add(func1);
        lista1.add(prof2);
        lista1.add(new Funcionario("Jose", "ad-5236", 7, "GH", 2341.87));
        lista1.add(new Funcionario("Joao", "gg-dsf55", 1, "TF", 3244.87));
           
        lista1.Listagem();
            
//          Operador instanceof 
//          Informa se o objeto é ou não intância de uma classe.
//          (obj instanceof classe), o resultado é booleano.
        boolean condicao = (lista1 instanceof ListaPessoas);
        String resultado = condicao ? "lista1 é instância de ListaPessoas" : "Não é";
        System.out.println(resultado);
    
//          Operador typecast
//          Exemplo de typecast ja conhecido:
//          int a = 10, b = 3;
//          double R = a/b; sem typecast
//          double R = (double)a/b; com typecast
//
//            Pessoa Lista[];
//            Lista[0].metodo();
//            if(Lista[0] instanceof Funcionario)
//            {
//                Funcionario f = (Funcionario)Lista[0];
//                f.metodoDaClasseFuncionario();
//            } 
    }    
    
}