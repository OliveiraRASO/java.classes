package aula08maio;

//Autor: @RASO
//Data: 

import java.util.*;

public class Ccidadao {
    
    //metodo cidadao
    public static void validaCidadao(char []a,int b,int c){
        int resultado = 0;
        int somaTotal = 0;
        int dobro;
        int resto; 
        int multiplica; 
        int [] vetor = new int[9];
        
        for(int i=0; i<9;i++){
            vetor[i] = Character.getNumericValue(a[i]);
        }
        multiplica = c * 2; 
        if(multiplica >= 10){
            multiplica -= 9; 
            somaTotal += multiplica; 
        }
        for(int i=0;i<9;i+=2){
            dobro = vetor[i] * 2; 
            if(dobro >= 10){
                dobro -= 9;
    
            }
            resultado += dobro; 
        }
        for(int j=1;j<9;j+=2){
            somaTotal += vetor[j];
        }
        somaTotal += b;
        somaTotal += resultado;
        somaTotal += Character.getNumericValue(a[11]);
        resto = somaTotal % 10; 
        
        if(resto == 0){
            System.out.println("Nº. CC válido");
        }else{
            System.out.println("Nº. CC inválido");
        }
    }
    
    //substitui letras
    public static int stringNum(char caracter){
        char letra;
        int num = 0;
        letra = caracter;
        switch (letra){
            case ('A'): 
                num = 10;
                break;
            case ('B'): 
                num = 11;
                break;
            case ('C'): 
                num = 12;
                break;
            case ('D'): 
                num = 13;
                break;
            case ('E'): 
                num = 14;
                break;
            case ('F'): 
                num = 15;
                break;
            case ('G'): 
                num = 16;
                break;
            case ('H'): 
                num = 17;
                break;
            case ('I'): 
                num = 18;
                break;
            case ('J'): 
                num = 19;
                break;
            case ('K'): 
                num = 20;
                break;
            case ('L'): 
                num = 21;
                break;
            case ('M'): 
                num = 22;
                break;
            case ('N'): 
                num = 23;
                break;
            case ('O'): 
                num = 24;
                break;
            case ('P'): 
                num = 25;
                break;
            case ('Q'): 
                num = 26;
                break;
            case ('R'): 
                num = 27;
                break;
            case ('S'): 
                num = 28;
                break;
            case ('T'): 
                num = 29;
                break;
            case ('U'): 
                num = 30;
                break;
            case ('V'): 
                num = 31;
                break;
            case ('W'): 
                num = 32;
                break;
            case ('X'): 
                num = 33;
                break;
            case ('Y'): 
                num = 34;
                break;
            case ('Z'): 
                num = 35;
                break;
            default: 
                break;
        }
        return num; 
        
    }
    
    //metodo principal
    public static void main(String[] args) {
        String num;
        String numSemEspacos; 
        int algarismo9;
        int algarismo10;
        
        //leitura de dados
        Scanner leia = new Scanner(System.in); 
        do{
            System.out.println("Digite o numero do cartão cidadão");
            num = leia.nextLine();
            numSemEspacos = num.replaceAll(" ", "");
        }while(numSemEspacos.length() != 12);
        
        //passa para array de caracteres
        char stringArray[] = numSemEspacos.toCharArray();
        algarismo9 = stringNum(stringArray[9]);
        algarismo10 = stringNum(stringArray[10]);
        
        //aplica metodo
        validaCidadao(stringArray,algarismo9,algarismo10);
    }
}