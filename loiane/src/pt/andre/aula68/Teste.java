package pt.andre.aula68;

public class Teste {

    public static void main(String[] args) {
        
        MinhaThreadRunable thread1 = new MinhaThreadRunable("#1", 900);
        //Thread t1 = new Thread(thread1);
        //t1.start();
        
        MinhaThreadRunable thread2 = new MinhaThreadRunable("#2", 600);
        
        MinhaThreadRunable thread3 = new MinhaThreadRunable("#30", 1100);
    }

}