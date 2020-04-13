package pecexercicios;

import java.util.Scanner;

public class Estacoes{

    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Insira um numero inteiro: ");
        int x = leia.nextInt();
        
        String estacoes[] = {"Inverno", "Primavera", "Verão", "Outono"};
        switch(x){
            case 1:
                System.out.println(estacoes[0]);
                break;
            case 2:
                System.out.println(estacoes[1]);
                break;
            case 3:
                System.out.println(estacoes[2]);
                break;
            case 4:
                System.out.println(estacoes[3]);
                break;
        }   
    }
}
