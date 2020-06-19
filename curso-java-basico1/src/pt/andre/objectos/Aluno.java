package pt.andre.objectos;

import java.util.Scanner;

public class Aluno {
	
	int idade;
	String nome;	
	String matricula;
	String sexo;
	String curso;
	double[] notas = new double[3];
	String[] disciplinas = new String[3];
	boolean aprovado = false;
	double media = 0;
	double soma = 0;
	
	void aluno() {
		System.out.println("Nome: " + nome);
		System.out.println("Matricula: " + matricula);
		System.out.println("Sexo: " + sexo);
		System.out.println("Curso: " + curso);
		System.out.println("Idade: " + idade);
		for (int i=0; i < disciplinas.length; i++) {
			System.out.println("Na disciplina " + disciplinas[i]+", a nota foi "+notas[i]);
		}		
				
		if (media > 7) {
			aprovado = true;
			System.out.println("Sua media foi de "+media+". Aprovado.");
		} else {
			aprovado = false;
			System.out.println("Sua media foi de "+media+". Reprovado.");
			System.out.println(soma);
		}		
	}
	
	Scanner scan = new Scanner(System.in);
	void DadosAluno() {
		System.out.println("Nome: ");
		nome = scan.nextLine();
		
		System.out.println("Matricula: ");
		matricula = scan.nextLine();
		
		System.out.println("Curso: ");
		curso = scan.nextLine();
		
		System.out.println("Idade: ");
		idade = scan.nextInt();
		
		System.out.println("Sexo: ");
		sexo = scan.next();
		
		for (int i=0; i < disciplinas.length; i++) {
			System.out.println("Digite a "+i+" disciplina: ");
			disciplinas[i] = scan.next();
			
			System.out.println("Qual foi a nota de "+ disciplinas[i]+"?");
			notas[i] = scan.nextDouble();
			soma += notas[i];
			media = soma / notas.length;
			
		}		
	}
}
