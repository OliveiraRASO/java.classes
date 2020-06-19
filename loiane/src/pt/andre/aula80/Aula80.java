package pt.andre.aula80;

public class Aula80 {

    public static void main(String[] args) {
        
        String teste= "Isso é um teste";
        
        System.out.println(teste);
        System.out.println(teste.substring(10));
        System.out.println(teste.substring(2, 14));
        
        String ola = "Olá";
        String mundo = " Mundo";
        String olaMundo = ola.concat(mundo); //ola + mundo
        System.out.println(olaMundo);
        
        String espacos = "e s p a ç o s";
        String semEspacos = espacos.replace('i', 'e');
        System.out.println(semEspacos);
        
        semEspacos = semEspacos.replaceAll(" ", "");
        System.out.println(semEspacos);
        
        String nome = "   meu nome é: ";
        System.out.println(nome);
        System.out.println(nome.trim());

    }
}