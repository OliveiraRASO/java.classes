package pcomputadores;

import java.util.Scanner;

public class Equacao2Grau {

    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        double numeros[] = new double[50];
        
        System.out.println("Insira o valor para o termo a: ");
        double a = leia.nextFloat();
        
        System.out.println("Insira o valor para o termo b: ");
        double b = leia.nextFloat();
        
        System.out.println("Insira o valor para o termo c: ");
        double c = leia.nextFloat();
        
        // calcula delta
        double delta = (b*b) -(4) * (a*c);
        
        // delta menor que zero
        if (delta < 0){
            System.out.println("Não existem raízes reais.\nDelta é inferior a 0.");
        } else{
            // delta maior ou igual a zero
            if (delta == 0){
                double formula = -((b) + (delta*1.5)) / 2*a;
                System.out.println("Existe uma raíz real.\nDelta é igual a 0. X = " + formula);
            }else{
                double formula1 = (-(b) + (Math.sqrt(delta))) / 2*a;
                double formula2 = (-(b) - (Math.sqrt(delta))) / 2*a;
                System.out.println("Existem duas raízes reais.\nDelta é maior que 0.\nX = " + formula1);
                System.out.println("X = " + formula2);
            }
        }
    }
}