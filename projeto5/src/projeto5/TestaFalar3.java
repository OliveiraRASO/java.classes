package Projeto5;

//@utor: RASO_@2019100463 //Eng_Informática
//Data: 29/05/2020

import java.util.*;

public class TestaFalar3 {

    public static void main(String[] args) {
        
        //
        //separador de linhas
        char s = '=';
        char[] separador = new char[35];
        Arrays.fill(separador, s);

        Scanner leia = new Scanner(System.in);
        Professor p = new Professor();
        Aluno a = new Aluno();
        String opcao;
        
        System.out.println("(A) - Aluno\n"
                + "(P) - Professor\n");
        
        System.out.println("Digite quais dados quer visualizar: ");
        opcao = leia.nextLine().toLowerCase();
        
        switch(opcao){
            case "a":
                System.out.println("Digite o nome do aluno: ");
                a.setNome(leia.nextLine());
                System.out.println("Digite o género do aluno: ");
                a.setGenero(leia.next().charAt(0));
                System.out.println("Digite a idade do aluno: ");
                a.setIdade(leia.nextInt());
                System.out.println(separador);
                
                System.out.println("Os dados introduzidos do aluno/a são: ");
                System.out.println("Nome: " + a.getNome());
                System.out.println("Género: " + a.getGenero());
                System.out.println("Idade: " + a.getIdade());
                a.falar();
                break;
                
            case "p":
                System.out.println("Digite o nome do professor: ");
                a.setNome(leia.nextLine());
                System.out.println("Digite o género do professor: ");
                p.setGenero(leia.next().charAt(0));
                System.out.println("Digite a idade do professor: ");
                a.setIdade(leia.nextInt());
                System.out.println(separador);
                
                System.out.println("Os dados introduzidos do professor/a são: ");
                System.out.println("Nome: " + a.getNome());
                System.out.println("Género: " + p.getGenero());
                System.out.println("Idade: " + a.getIdade());
                p.falar();
                break;
        }
    }
}