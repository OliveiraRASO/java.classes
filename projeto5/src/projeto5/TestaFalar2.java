package Projeto5;

//@utor: RASO_@2019100463 //Eng_Informática
//Data: 29/05/2020

import java.util.*;

public class TestaFalar2{

    public static void main(String[] args) {
        
        //
        //separador de linhas
        char s = '=';
        char[] separador = new char[35];
        Arrays.fill(separador, s);

        Scanner leia = new Scanner(System.in);
        Aluno a = new Aluno("Pedro Martins", 'M', 15, 23, "A");
        Professor p = new Professor("Helena Lopes", 'F', 40,550, 2);
        String opcao;
        
        System.out.println("(A) - Aluno\n"
                + "(P) - Professor\n");
        
        System.out.println("Digite quais dados quer visualizar: ");
        opcao = leia.nextLine().toLowerCase();
        
        switch (opcao) {
            case "a":
                //
                //printa instancia aluno
                System.out.println("Nome: " + a.getNome());
                System.out.println("Género: " + a.getGenero());
                System.out.println("Idade: "+ a.getIdade());
                System.out.println("Número: " + a.getNumero());
                System.out.println("Turma: " + a.getTurma());
                
                a.falar();
                System.out.println(separador);
                break;
            case "p":
                //
                //printa instancia professor
                System.out.println("Nome: " + p.getNome());
                System.out.println("Género: " + p.getGenero());
                System.out.println("Idade: "+ p.getIdade());
                System.out.println("Grupo de docência: " + p.getGrupoDocencia());
                System.out.println("Escalão: "+ p.getEscalaoProfessor());
                
                p.falar();
                System.out.println(separador);
                break;
        }
    }
}