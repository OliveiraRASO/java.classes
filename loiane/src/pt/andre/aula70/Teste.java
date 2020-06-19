package pt.andre.aula70;

import pt.andre.aula67.MinhaThread;

public class Teste {

    public static void main(String[] args) {
        
        MinhaThreadRunable thread1 = new MinhaThreadRunable("#1", 500);
        MinhaThreadRunable thread2 = new MinhaThreadRunable("#2", 500);
        MinhaThreadRunable thread3 = new MinhaThreadRunable("#3", 500);
        
        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        Thread t3 = new Thread(thread3);
        
        t1.setPriority(5);
        t2.setPriority(3);
        t3.setPriority(1);
        
        t1.start();
        t2.start();
        t3.start();
        
    }

}