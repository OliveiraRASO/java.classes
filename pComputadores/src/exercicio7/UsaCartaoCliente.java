package exercicio7;

//@utor: RASO_@2019100463 //Eng_Informática
//Data: 22/05/2020

import java.util.*;

public class UsaCartaoCliente {

    public static void main(String[] args) {

        int p1 = 0, p2 = 0;
        Scanner leia = new Scanner(System.in);
        CartaoCliente cliente = new CartaoCliente(50, ", Sofia:");
        CartaoCliente cliente2 = new CartaoCliente();
        
        //
        //printa pontos de clientes
        System.out.println("Inicialmente...");
        System.out.println("O cliente 1 tem " + cliente.mostraPontos() + " pontos.");
        System.out.println("O cliente 2 tem " + cliente2.mostraPontos() + " pontos.");
        System.out.println();
        //
        //printa crédito de 45.5 pontos cliente1
        System.out.println("Após crédito de 45.5 pontos no cliente 1...");
        cliente.creditaPontos(45.5);
        System.out.println("O cliente 1 tem " + cliente.mostraPontos() + " pontos.");
        System.out.println("O cliente 2 tem " + cliente2.mostraPontos() + " pontos.");
        System.out.println();
        
        //
        //transfere pontos entre clientes
        System.out.println("Após transferência de pontos entre clientes...");
        cliente2.transferePontos(cliente);
        System.out.println("O cliente 1 tem " + cliente.mostraPontos() + " pontos.");
        System.out.println("O cliente 2 tem " + cliente2.mostraPontos() + " pontos.");
        System.out.println();
        
        //
        //printa débito de 20 pontos cliente2
        System.out.println("Após débito de 20 pontos no cliente 2...");
        cliente2.debitaPontos(20.0);
        System.out.println("O cliente 1 tem " + cliente.mostraPontos() + " pontos.");
        System.out.println("O cliente 2 tem " + cliente2.mostraPontos() + " pontos.");
        System.out.println();
        
        System.out.println(cliente.toString());
        System.out.println(cliente2.toString());
        
    }
}