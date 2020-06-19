package treinospooconta;

//@utor: RASO_@2019100463 //Eng_Informática
//Data: 

import java.util.*;

public class Banco1 extends ContaBancaria{
    
    public static void main(String[] args) {
        
        //
        //separador de linhas
        char a = '=';
        char [] separador = new char [35];
        Arrays.fill(separador, a);
        
        //
        //cria instancia CONTA ORDEM 1
        ContaBancaria conta1 = new ContaBancaria("Ruben", 500);
    
        //
        //printa dados
        System.out.println("Dados da CONTA ORDEM 1");
        System.out.println(conta1.toString());
        
        //
        //deposita 100 e printa dados
        System.out.println("Deposita 100€...");
        conta1.deposita(100);
        System.out.println("Saldo atual: " + conta1.getSaldoConta() + "€");
        System.out.println(separador);
        
        //
        //levanta 20 e printa dados
        System.out.println("Levanta 20€...");
        conta1.levanta(20);
        System.out.println("Saldo atual: " + conta1.getSaldoConta() + "€");
        System.out.println(separador);
        System.out.println();
        
        //
        //cria instancia CONTA ORDEM 2
        ContaBancaria conta2 = new ContaBancaria("Lara", 2000);
        
        //
        //printa dados
        System.out.println("Dados da CONTA ORDEM 2");
        System.out.println(conta2.toString());
        
        //
        //novas funcionalidades
        System.out.println(separador);
        System.out.println("Novas funcionalidades...Contas Ordem");
        System.out.println(separador);
        
        //
        //cria instancia CONTA ORDEM
        ContaOrdem cOrdem = new ContaOrdem("Sofia", 2500, 100);
        ContaOrdem cOrdem2 = new ContaOrdem("Ana", 1500, 500);
        
        //
        //printa dados CONTAS ORDEM
        System.out.println(cOrdem.toString());
        System.out.println(separador);
        
        //
        //compara creditos CONTAS ORDEM
        System.out.println("Compara créditos Contas Ordem");
        cOrdem.comparaCreditos(cOrdem2);
        System.out.println(separador);
        System.out.println();
        
        //
        //cria instancias conta prazo
        ContaPrazo cPrazo1 = new ContaPrazo("Joana", 3000, 150);
        
        //
        //printa dados CONTA PRAZO 1
        System.out.println("CONTA PRAZO...");
        System.out.println(cPrazo1.toString());
        
        //
        //printa dados saldo final CONTA PRAZO
        System.out.println("Saldo final calculado = " + cPrazo1.saldoFinal() + "€");
        
        
    }
    
}