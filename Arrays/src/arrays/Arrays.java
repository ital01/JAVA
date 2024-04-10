//Arrays em java são sempre dinâmicos, 
//e como tudo em java, são objetos, 
//possuindo atributos e metodos.

package arrays;

public class Arrays 
{

    public static void main(String[] args)
    {
//        Aula 08/04
//        
//        convenção:   tipo nome [Linhas][Colunas]; "nome" é um array
//                           tipo [Linhas][Colunas] nome; o tipo é um array
//        
//        int[][] exemplo;
//        int exemplo [][];
//        
//        exemplo = new int [10][20];
//      
//        int mat[][];
//        mat = new int[10][20];
//        
//        int L = mat.length;
//        System.out.println(L);
//       
//        int C = mat[0].length;
//        System.out.println(C);
//
//
//      Atividade aula 08/04:
//       
//        double m1[][] = new double[10][15];
//
//        for (int i = 0; i < m1.length; i++) 
//        {
//            for (int j = 0; j < m1[i].length; j++) 
//            {
//                m1[i][j] = i * i + 2 * j;
//            }
//        }
//
//        for (int i = 0; i < m1.length; i++) 
//        {
//            for (int j = 0; j < m1[i].length; j++) 
//            {
//                System.out.println("m1[" + i + "][" + j + "] = " + m1[i][j]);
//            }
//        }
//        
//        
//        double m2[][] = new double[10][15];
//        
//        for (int i = 0; i < m2.length; i++) 
//        {
//            for (int j = 0; j < m2[i].length; j++) 
//            {
//                m2[i][j] = m1[j][i];
//            }
//        }
//        
//        for (int i = 0; i < m2.length; i++) 
//        {
//            for (int j = 0; j < m2[i].length; j++) 
//            {
//                System.out.println("m2[" + i + "][" + j + "] = " + m2[i][j]);
//            }
//        }        
//
//        Resolução professor:
        
        double m1[][];
        m1= new double[10][15];
        
        for(int i=0; i<m1.length; i++)
        {
            for(int j=0; j<m1[i].length; j++)
                m1[i][j]= (double)i*i + j*2;                
        }
        
        for(int i=0; i<m1.length; i++)
        {
            System.out.printf("[%2d]:", i);
            for(int j=0; j<m1[i].length; j++)
            {
                System.out.printf("%6.1f", m1[i][j]);
            }
            System.out.println();
        }
        
        
        double m2[][]= new double[15][10];
        
        for(int i=0; i<m2.length; i++)
            for(int j=0; j<m2[i].length; j++)
                m2[i][j]= m1[j][i];
        
        System.out.println("+---------------------------------------------------+");


        for(int i=0; i<m2.length; i++)
        {
            System.out.printf("[%2d]:", i);
            for(int j=0; j<m2[i].length; j++)
            {
                System.out.printf("%6.1f", m2[i][j]);
            }
            System.out.println();
        }
        
        
//          Aula 10/04
//          Arrays de Objetos
//
//          O tipo base de um array pode ser uma classe.
//          Nesse caso, o array será uma coleção de instâncias dessa classe.
//          
//          Como já foi citado, um objeto de uma classe descendente
//          também é instanciado de todas suas classes ancestrais.
//          
//          Portanto, se o tipo base do array for uma classe ancestral, o array
//          poderá conter objetos dessa classe e também de todas suas classes descendentes.
//          
//          Levando ao extremo, se o tipo bsae for a classe Object, o array
//          poderá conter objetos de qualquer classe, já que todas as clsses são 
//          descendentes de Object.
        

    }
    
}
