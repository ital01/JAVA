package Cartesiano;

public class Cartesiano 
{

    public static void main(String[] args) 
    {
        Ponto p1 = new Ponto(3,7);
        Ponto p2 = new Ponto(9,4);
        
        Circulo c1 = new Circulo();
        Circulo c2 = new Circulo(p1,5);
        Circulo c3 = new Circulo (c2);
        Circulo c4 = new Circulo (p2,8);
        
        c1.print();
        c2.print();
        c3.print();
        
        c1.assign(c4);
        c1.print();
        
        c1.escale(4);
        c1.print();
        
        System.out.println(c1.toString());
        System.out.println(c1.perimeter());
        System.out.println(c1.area()+"\n");
        
    }
    
}