package pt.andre.aula49;

public class Finally {
    
    public static void main(String[] args) {
        
        int [] numeros = {4, 8, 16, 32, 64, 128};
        int [] denominadores = {2, 0, 4, 8 ,0};
        
        for (int i=0 ; i<numeros.length; i++){
            try{
                System.out.println(numeros[i] + "/" + denominadores[i] + " = " + numeros[i]/denominadores[i]);
            }
            catch(ArithmeticException | ArrayIndexOutOfBoundsException e){
                System.out.println("Erro ao dividir por zero");
            }
            catch (Throwable e){
                System.out.println("Erro de indice");
            }
        }
        
    }

}