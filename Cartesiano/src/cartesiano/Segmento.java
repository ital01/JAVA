package Cartesiano;

public class Segmento 
{
    
    /////////////////////////////
   // EXERCICIO 5
    
    private Ponto p1;
    private Ponto p2; 
    
    public Segmento() 
    {
        p1 = new Ponto();
        p2 = new Ponto(0, 1);
    }

    public Segmento(Ponto p1, Ponto p2) 
    {
        this.p1 = p1;
        this.p2 = p2;
    }
    
    public Segmento(Segmento sg)
    {
        p1 = sg.p1;
        p2 = sg.p2;
    }
    
    public void assign(Segmento sg)
    {
        p1 = sg.p1;
        p2 = sg.p2;
    }
    
    public void desloc(double dX, double dY)
    {
        p1.desloc(dX, dY);
        p2.desloc(dX, dY);
        
//     p1.x += dX;
//     p1.y += dY;
//       
//     p2.x += dX;
//     p2.y += dY;
    }
    
    public void escale(double factor)
    {  
        p1.escale(factor);
        p2.escale(factor);
        
//     p1.x *= factor;
//     p1.y *= factor;
//        
//     p2.x *= factor;
//     p2.y *= factor;
    }
    
    @Override
    public String toString ( )
    {
        return "[" + p1.toString() + " , " + p2.toString() + "]";
//     return "(" + p1.getX() + " , " + p1.getY() + ") , (" + p2.getX() + " , " + p2.getY() + ")";
    }
    
    public double length( )
    {
        return p1.distance(p2);
    }
    
    public boolean isValid()
    {
        if(p1 == null || p2 == null) return false;
        return length()>0;
//      return !(p1.equals(p2) || p2.equals(p1));
    }
    
    public Ponto midPoint()
    {
        double xm = (p1.getX() + p2.getX())/2;
        double ym = (p1.getY() + p2.getY())/2;
        
        return new Ponto(xm,ym);
        
//        Ponto pMedio = new Ponto();

//        pMedio.x = (p1.x + p2.x)/2;
//        pMedio.y = (p1.y + p2.y)/2;
        
        
//        return pMedio;
    }
}