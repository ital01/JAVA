package tecelagem;

public class Producao extends Funcionario
{
    private int horaDiurna, horaNoturna;
    
    public Producao(String nome, String rg, double salarioBase) 
    {
        super(nome, rg, salarioBase);
        registrarHorasDiurnas(0);
        registrarHorasNoturnas(0);
    }

    public int getHoraDiurna() 
    {
        return horaDiurna;
    }

    public int getHoraNoturna() 
    {
        return horaNoturna;
    }
    
    public final void registrarHorasDiurnas(int horas) 
    {
        horaDiurna = horas;
    }
    
    public final void registrarHorasNoturnas(int horas) 
    {
        horaNoturna = horas;
    }
    
    public double valorDiurno()
    {
        return getSalarioBase()*getHoraDiurna();
    }
    
    public double valorNoturno()
    {
        return getSalarioBase()*getHoraNoturna()*1.3;
    }

    @Override
    public double salarioLiquido() 
    {
        return valorDiurno() + valorNoturno();
    }

    @Override
    public void novoMes() 
    {
        registrarHorasDiurnas(0);
        registrarHorasNoturnas(0);
    }
    
   @Override
    public void hollerith( )
    {
        super.hollerith();
        System.out.println("Horas Diurnas: " + getHoraDiurna());
        System.out.println("Horas Noturnas: " + getHoraNoturna());
        System.out.printf("\n");
    }
}