package pcomputadores;

import java.util.Scanner;

public class OperadorTernario {

    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Insira uma nota: ");
        int nota = leia.nextInt();
        
        String p = "Parabéns";
        String f = "Tente novo exame";
        
        // operador ternário
        String resultado = (nota >= 10) ? p : f;
        
        System.out.println(resultado);
        
    }

}
