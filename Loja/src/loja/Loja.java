package loja;

public class Loja 
{

    public static void main(String[] args) 
    {
        Roupa roupa1 = new Roupa("Camiseta", 42, 29.99, 50);
        Roupa roupa2 = new Roupa("Calça Jeans", 38, 59.99, 30);
        Roupa roupa3 = new Roupa("Blusa de Frio", 40, 79.99, 20);

        Roupa[] estoque = new Roupa[10];
        ListaEstoque listaEstoque = new ListaEstoque(estoque, 10);

        listaEstoque.add(roupa1);
        listaEstoque.add(roupa2);
        listaEstoque.add(roupa3);

        System.out.println("Quantidade inicial de camisetas: " + roupa1.getUnits());
        listaEstoque.incUnits(0, 1);
        System.out.println("Quantidade apos incremento: " + roupa1.getUnits());

        System.out.println("\n");
        
        System.out.println("Quantidade inicial de calças jeans: " + roupa2.getUnits());
        listaEstoque.decUnits(1, 5);
        System.out.println("Quantidade apos decremento: " + roupa2.getUnits());
        
        System.out.println("\n");
        
        System.out.println("Estoque da loja:");
        listaEstoque.listAll();
    }
}
