package pt.andre.aula95;

import java.util.Locale;
import java.util.ResourceBundle;

public class Aula95 {

    public static void main(String[] args) {
        
        System.out.println("Locale atual: " + Locale.getDefault());
        ResourceBundle rb = ResourceBundle.getBundle("meutexto");
        
        System.out.println("ola" + rb.getString("hello"));

    }
}