package pt.andre.aula63;

public class ExemploPrintf {

    public static void main(String[] args) {
        
        System.out.printf("%20s", "Rúben André");// alinhamento á dir.
        System.out.println();
        System.out.printf("%-20S", "\nRúben André");// alinhamento á esq.
        System.out.println();
        
        System.out.printf("%c", 'c');
        System.out.println();
        System.out.printf("%S", 'c');
        System.out.println();
        
        
        int valor = -1234653;
        
        int valor2 = -465798;
        System.out.printf("% d", valor2);
        System.out.println();
        System.out.printf("% d", valor);
        System.out.println();
    }
}