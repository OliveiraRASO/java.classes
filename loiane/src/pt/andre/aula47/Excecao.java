package pt.andre.aula47;

public class Excecao {
    
    public static void main(String[] args) {
        
        try {
            int [] vetor = new int [4];
            System.out.println("Antes da exception");
        
            vetor[4] = 1;
            System.out.println("Esse texto nao será impresso");
        }catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("Excepção ao acessar um indice do vetor que nao existe");
        }
        System.out.println("Esse texto será impresso apos exception");
    }
}