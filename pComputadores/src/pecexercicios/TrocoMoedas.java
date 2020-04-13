package pecexercicios;

import java.util.*;

public class TrocoMoedas {
    
    // variável global moedas []
    private static int []moedas = {200, 100, 50, 20, 10, 5, 2, 1};
    
    public static void retornaTroco (int preco_formal){
        int m;
        for(int i=0; i<moedas.length; i++){
            m = preco_formal / moedas.length;
            if(m != 0){
                System.out.println(m + " moedas de " + moedas[i]/100.0 + " €");
                preco_formal %= moedas[i];
            }
        }
        System.out.println(preco_formal);
    }

    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite o preço do produto: ");
        int preco_produto = leia.nextInt();
        retornaTroco(preco_produto);    
    }
}
