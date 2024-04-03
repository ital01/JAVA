package Cartesiano;

public class Circulo extends Ponto
{    
    
    /////////////////////////////
   // EXERCICIO 6
    
    private double raio;

    public Circulo() 
    {
        super();
        raio = 1;
    }

    public Circulo(double vX, double vY, double raio) 
    {
        super(vX, vY);
        this.raio = raio;
    }
    
     public Circulo(Ponto p, double raio) 
    {
        super(p);
        this.raio = raio;
    }

    public Circulo(Circulo c) 
    {
        //funciona porque ponto é ancestral de circulo, ou seja, 
        //circulo herda um ponto, portanto, 
        //o construtor de ponto aceita um circulo (e ignora o raio)
        super(c); 
        raio = c.raio;
    }

    public double getRaio() 
    {
        return raio;
    }

    public void setRaio(double raio) 
    {
        this.raio = raio;
    } 
    
    public void assign(Circulo cl)
    {
        super.assign(cl);
        raio = cl.raio;
    }
    
    @Override
    public void escale(double factor)
    {
        super.escale(factor);
        raio*=factor;
    }
    
    @Override
    public String toString ()
    {
        return super.toString() + ":" + getRaio();
    }
    
    public boolean isValid()
    {
        return getRaio() > 0;
    }
    
    public double perimeter( )
    {
        return 2 * Math.PI * getRaio();
    }
    
    public double area( )
    {
    return Math.pow(Math.PI * getRaio(),2);
    }
    
    @Override
    public void print()
    {
        System.out.println("Centro: " + super.toString());
        System.out.println("Raio: " + getRaio());
        System.out.printf("\n");
    }
}
