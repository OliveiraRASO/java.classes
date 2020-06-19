package pt.andre.aula90;

import java.util.Locale;

public class Aula90LocaleInternacionalizacao {

    public static void main(String[] args) {
        
        Locale locale = Locale.getDefault();
        System.out.println(locale);
        
        System.out.println();
        
        Locale[] locales = Locale.getAvailableLocales();
        for(Locale loc : locales){
            System.out.println("Nome: " + loc.getDisplayName());
            System.out.println("Codigo lingua: " + loc.getLanguage());
            System.out.println("Lingua: " + loc.getDisplayLanguage(locale));
            System.out.println("****************");
        }
    }
}