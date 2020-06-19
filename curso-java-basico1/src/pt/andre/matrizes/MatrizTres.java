package pt.andre.matrizes;

import java.util.Scanner;

public class MatrizTres {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int matriz[][] = new int [3][3];
		int pares = 0;
		int impares = 0;
		
		for ( int i=0; i<matriz.length; i++) {
			for (int j=0; j<matriz[i].length; j++) {
				System.out.print("Digite um nº para a posição ["+i+","+j+"]: ");
				matriz[i][j] = scan.nextInt();
				
				if (matriz[i][j] % 2 == 0) {
					pares++;
				} else {
					impares++;
				}
			}			
		}System.out.println("================================");
		
		for (int i=0; i<matriz.length; i++) {
			for (int j=0; j<matriz[i].length; j++) {
				System.out.print(matriz[i][j]+" ");
			}System.out.println();
		}
		System.out.println("Os pares são: " + pares+" ");
		System.out.println("Os impares são: "+ impares+" ");
	}

}
