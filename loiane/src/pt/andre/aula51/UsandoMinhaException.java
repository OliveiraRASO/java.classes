package pt.andre.aula51;

public class UsandoMinhaException {
    
    public static void main(String[] args) {
        
        int[] numeros = {4, 8, 15, 32, 64, 128};
        int[] denominadores = {4, 0, 8, 0, 8,};
        
        for (int i=0; i<numeros.length; i++){
            try{
                if (numeros[i] % 2 != 0){
                    //minha exception
                    throw new Exception("DADOS INVALIDOS");
                }
                System.out.println(numeros[i] + "/" + denominadores[i] + " = " + (numeros[i]/denominadores[i]));
            }
            catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
                System.out.println("Aconteceu erro");
            }
            catch(Exception e){
                System.out.println("Aconteceu erro");
                System.out.println(e.getMessage());
            }
                
            }
        }   
    }