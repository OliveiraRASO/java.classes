package pt.andre.aula78;

public class Aula78 {

    public static void main(String[] args) {
        
        String ola = "Olá";
        String ola2 = "OLÁ";
        String ola3 = "Olá";
        
        System.out.println("ola equals ola2 = " + ola.equals(ola2)); //false
        System.out.println("ola equals ola2 = " + ola.equals(ola3)); //true
        
        System.out.println("ola equals ola2 = " + ola.equalsIgnoreCase(ola2)); //true
        
        System.out.println("ola == ola1" + (ola == ola2)); //false
        System.out.println("ola == ola3" + (ola == ola3)); //

    }
}