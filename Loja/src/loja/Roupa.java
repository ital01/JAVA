package loja;

public class Roupa implements ItemEstoqueInt
{
    private String descricao;
    private int tamanho;
    private double preco;
    private int qtdEstoque;

    public Roupa(String descricao, int tamanho, double preco, int qtdEstoque) {
        this.descricao = descricao;
        this.tamanho = tamanho;
        this.preco = preco;
        this.qtdEstoque = qtdEstoque;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public void incUnits(int qtd) 
    {
        qtdEstoque += qtd;
    }

    @Override
    public void decUnits(int qtd) 
    {
        qtdEstoque -= qtd;
    }

    @Override
    public int getUnits() 
    {
        return qtdEstoque;
    }

    @Override
    public float getPrice() 
    {
        return (float)preco;
    }

    @Override
    public void print() 
    {
        System.out.println("Descricao: " + getDescricao());
        System.out.println("Tamanho: " + getTamanho());
        System.out.printf("Preco: %.2f R$ \n", getPrice());
        System.out.println("Estoque total: " + getUnits());
        System.out.printf("\n");
    }
    
}
