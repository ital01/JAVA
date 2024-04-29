package tecelagem;

public class Tecelagem
{

    public static void main(String[] args)
    {
        Administrativo adm1 = new Administrativo("ADM", "1234", 2000);
        Producao prod1 = new Producao("PROD", "9999", 100);
        Vendedor vend1 = new Vendedor("VEND", "7777", 1000);
        
//     for(int i = 0; i<20; i++) adm1.registrarFalta();
//     adm1.hollerith();
//     adm1.novoMes();
//     adm1.hollerith();
//        
//     prod1.registrarHorasDiurnas(4);
//     prod1.registrarHorasNoturnas(4);
//     prod1.hollerith();
//     prod1.novoMes();
//     prod1.hollerith();
//        
//     vend1.registrarVenda(3000);
//     vend1.hollerith();
//     vend1.novoMes();
//     vend1.hollerith();
        
        ListaFuncionarios lista1 = new ListaFuncionarios(3);
            
        lista1.add(adm1);//0
        lista1.add(prod1);//1 
        lista1.add(vend1);//2
            
        lista1.registrarFalta(0);
        lista1.registrarHorasDiurnas(1, 4);
        lista1.registrarHorasNoturnas(1, 6);
        lista1.registrarVenda(2, 245.9);
        
        lista1.Listagem();
    }
}