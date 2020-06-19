package pt.andre.testes;

import java.util.Scanner;

public class TesteArraysMultidimensionais {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double[][] notasAlunos = new double[3][4];
		
		notasAlunos[0][0] = 10;
		notasAlunos[0][1] = 7;
		notasAlunos[0][2] = 9;
		notasAlunos[0][3] = 9.5;
		
		notasAlunos[1][0] = 9;
		notasAlunos[1][1] = 5;
		notasAlunos[1][2] = 2.9 ;
		notasAlunos[1][3] = 9;
		
		notasAlunos[2][0] = 9;
		notasAlunos[2][1] = 6;
		notasAlunos[2][2] = 2;
		notasAlunos[2][3] = 4.5;
		
		/*for (int i=0; i<notasAlunos.length; i++) {
			for (int j=0; j<notasAlunos[i].length; j++) {
				System.out.print(notasAlunos[i][j]);
			}System.out.println();
		}
		
		notasAlunos[1][2] = 5;
		
		for (int i=0; i<notasAlunos.length; i++) {
			for (int j=0; j<notasAlunos[i].length; j++) {
				System.out.print(notasAlunos[i][j]);
			}System.out.println();
		}
		
		double soma;
		
		for (int i=0; i<notasAlunos.length; i++) {
			soma = 0;
			for (int j=0; j<notasAlunos[i].length; j++) {
				soma += notasAlunos[i][j];				
			}System.out.print("a soma vale: "+ soma / 4);
		}*/
		
		double[][][][][] alunos = {{{{{5, 2, 4, 6},{1, 2, 3, 6}, {4, 5, 2, 8}, {1, 2, 3, 4}, {5, 6, 8, 7}}}}};
		
		for (int i=0; i<alunos.length; i++) {
			for (int j=0; j<alunos[i].length; j++) {
				for (int k=0; k<alunos[i][j].length; k++) {
					for (int l=0; l<alunos[i][j][k].length; l++) {
						for (int p=0; p<alunos[i][j][k][l].length; p++) {
							System.out.print(alunos[i][j][k][l][p] + " ");
						}System.out.println();
						
					}
				} 
					
				
			}
		}
	}

}
