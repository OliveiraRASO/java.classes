package raso.pt.pcomputadores;

import java.util.*;

public class ContagemNumeros {

    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        int x = 1;
        int cont_negativos = 0;
        int cont_positivos = 0;
        
        // ciclo do while
        // ciclo do while
//        do{
//            System.out.println("Insira um número: ");
//            x = leia.nextInt();
//            
//            if(x > 0){
//                // conta positivos
//                cont_positivos += 1;
//            } else{
//                // conta negativos
//                cont_negativos += 1;
//            }
//        } while(x != 0);
//        System.out.println("Foram digitados: " + cont_positivos + " números positivos.\n"
//                + "Foram digitados: " + cont_negativos + " números negativos.");
        

        // ciclo while
        // ciclo while
//        boolean flag = false;
//        while (true){
//            
//            if(flag == false){
//                System.out.println("Insira um número: ");
//                x = leia.nextInt();
//
//                if(x > 0){
//                    // conta positivos
//                    cont_positivos += 1;
//                } else{
//                    // conta negativos
//                    cont_negativos += 1;
//                }
//                System.out.println("Foram digitados: " + cont_positivos + " números positivos.\n"
//                    + "Foram digitados: " + cont_negativos + " números negativos.");
//            } else {
//                System.out.println("Saida");
//            }
//        }
        
        // ciclo for
        // ciclo for
        for(int i=1; i<15; i++){
            System.out.println("Insira um número: ");
                x = leia.nextInt();

                if(x > 0){
                    // conta positivos
                    cont_positivos += 1;
                } else{
                    // conta negativos
                    cont_negativos += 1;
                }
                System.out.println("Foram digitados: " + cont_positivos + " números positivos.\n"
                    + "Foram digitados: " + cont_negativos + " números negativos.");
        }
    }
}