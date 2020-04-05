package pcomputadores;

import java.util.*;

public class Pauta20Alunos {
    
    public static final int ALUNOS = 3;
    
    // metodo p/ guardar dados/notas de alunos
    public static void listaAlunos(String []a, double []n){
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o nome e a nota de 20 alunos: ");
        
        for(int i=1; i<a.length; i++){
            System.out.println(i + "º nome: ");
            a[i] = leia.nextLine();
            System.out.println("Digite nota de " + a[i]);
            n[i] = leia.nextInt();
            leia.nextLine();
        }
    }
    
    // metodo printa notas alunos
    public static void listaNotas(double []n){
        for(int i=1; i<n.length; i++){
            System.out.println("As notas são: " + n[i]);
        }
    }
    
    // metodo altera nota
    public static void alteraNota(String []a, double []n){
        Scanner leia = new Scanner( System.in) ;
        System.out.println( "Insira o número do aluno a alterar");
        int posicao = leia.nextInt();
        if( posicao >= 1 && posicao <= ALUNOS ){
            int i = 0;
            while( i != posicao-1 && i < ALUNOS )
                i++;
            if( i != ALUNOS ){
                System.out.println( "Insira a nova nota de " + a[i] );
                n[i] = leia.nextDouble();
            }
        }
        else
            System.out.println( "Número inválido!" );
    }
    
    // metodo listagem de alunos
    public static void listagemAlunos(String []a, double[]n){
        for(int i=1; i<a.length; i++){
            System.out.println("Os alunos são: " + a[i]);
        }
    }
    
    // metodo que ordena alfabeticamente
    public static void ordenaAlfabeticamente(String []a, double []n){
      int i, j, k; 
      String min; 
      double min2;
      for( i=0; i<ALUNOS; i++ ){ 
            k = i; 
            min = a[k]; 
            min2 = n[k];
            for( j=i+1; j<ALUNOS; j++ ){ 
                  if( a[j].compareTo( min ) < 0 ) { 
                    k = j; 
                    min = a[k]; 
                    min2 = n[k];
                  } 
            }
            a[k] = a[i]; 
            n[k] = n[i];
            a[i] = min; 
            n[i] = min2;
      } 
    }

    public static void main(String[] args) {
        double []notas_alunos = new double[ALUNOS];
        String []nomes_alunos = new String[ALUNOS];
    
        Scanner leia = new Scanner(System.in);
        int opcao;
        do{
            System.out.println("(1) Inserir alunos\n"
                + "(2) Pesquisar nota\n"
                + "(3) Alterar nota\n"
                + "(4) Listagem de alunos\n"
                + "(5) Ordenação alfabética\n"
                + "(6) Sair");
            System.out.println();
            System.out.println("Selecione uma opção: ");
            opcao = leia.nextInt();
            
            // escolha de opção
            if(opcao == 1){
                // inserir dados
                listaAlunos(nomes_alunos, notas_alunos);
            }else if(opcao == 2){
                // pesquisar nota
                listaNotas(notas_alunos);
            }else if(opcao == 3){
                // alterar nota
                alteraNota(nomes_alunos, notas_alunos);
            }else if(opcao == 4){
                // listagem de alunos
                listagemAlunos(nomes_alunos, notas_alunos);
            }else if(opcao == 5){
                // ordenação alfabéstica
                ordenaAlfabeticamente(nomes_alunos, notas_alunos);
            }
        }while(opcao != 6);
        
    }
}