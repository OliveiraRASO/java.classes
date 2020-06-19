package pt.andre.testes;

public class TesteMatrizesDimensoes {

	public static void main(String[] args) {
		
		int [][][] matriz = new int [3][3][3];
		
		for (int i=0; i<matriz.length; i++) {
			for (int j=0; j<matriz[i].length; j++) {
				for (int k=0; k<matriz[i][j].length; k++) {
					System.out.print(matriz[i][j][k]);
				}System.out.println();
			}
		}

	}

}
