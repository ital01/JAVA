package loja;

public interface ItemEstoqueInt 
{
    // incrementa a quantidade em estoque
    void incUnits(int qtd); 
    
    //decrementa a quantidade em estoque. 
    //Se a quantidade em estoque for menor que a quantidade informada, não faça nada.
    void decUnits(int qtd); 
    
    //retorna a quantidade em estoque.
    int getUnits();
    
    //retorna o preço da roupa.
    float getPrice();
    
    //imprime os dados da peça.
    void print();
}

