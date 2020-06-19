package pt.andre.aula36.labs;

import java.util.Scanner;

public class TesteCurso {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o nome do curso: ");
        String nome = scan.nextLine();
        
        System.out.println("Digite o horário do curso: ");
        String horario = scan.nextLine();
        
        System.out.println("Digite o nome do professor: ");
        String nomeProf = scan.nextLine();
        
        System.out.println("Digite o departamento do professor: ");
        String depProf = scan.nextLine();
        
        System.out.println("Digite o email do professor: ");
        String emailProf = scan.nextLine();
        
        Curso curso = new Curso();
        curso.setNome(nome);
        curso.setHorario(horario);
        
        Professor professor = new Professor();
        professor.setNome(nome);
        professor.setDepartamento(depProf);
        professor.setEmail(emailProf);
        
        curso.setProfessor(professor);
        
        System.out.println("===Alunos===");
        
        Aluno [] alunos = new Aluno[5];
        for (int i=0 ;i<5; i++){
            System.out.println("Digite o nome do "+(i+1)+"º aluno: ");
            String nomeAluno = scan.nextLine();
            
            System.out.println("Digite a matricula do aluno: ");
            String matricula = scan.nextLine();
            
            double notas[] = new double[4];
            for (int j=0; j<4; j++){
                System.out.println("Digite a "+(j+1)+"ª nota do aluno: ");
                notas[j] = scan.nextDouble();
            }
            
            Aluno aluno = new Aluno();
            aluno.setNome(nome);
            aluno.setMatriula(matricula);
            aluno.setNotas(notas);
            
            alunos[i] = aluno;
        }        
        curso.setAlunos(alunos);
        
        System.out.println(curso.obterInfo());
    }
    
}
