package pt.andre.aula69;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Teste2 {
    
    public static void main(String[] args) {
        
        MinhaThreadRunable thread1 = new MinhaThreadRunable("#1", 300);
        Thread t1 = new Thread(thread1);
        
        MinhaThreadRunable thread2 = new MinhaThreadRunable("#2", 600);
        Thread t2 = new Thread(thread2);
        
        MinhaThreadRunable thread3 = new MinhaThreadRunable("#3", 900);
        Thread t3 = new Thread(thread3);
        
        t1.start();
        t2.start();
        t3.start();
        
        while(t1.isAlive() || t2.isAlive() || t3.isAlive()){
            for(int i=0; i<7; i++){
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        
        System.out.println("Programa finalizado");
    }
    
}