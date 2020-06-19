package pt.andre.aula69;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Teste3 {

    public static void main(String[] args) {
        
        MinhaThreadRunable thread1 = new MinhaThreadRunable("#1", 500);
        Thread t1 = new Thread(thread1);
        
        MinhaThreadRunable thread2 = new MinhaThreadRunable("#2", 700);
        Thread t2 = new Thread(thread2);
        
        MinhaThreadRunable thread3 = new MinhaThreadRunable("#3", 800);
        Thread t3 = new Thread(thread3);
        
        t1.start();
        
        /*try {
            t1.join(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        
        t2.start();
        /*try {
            t2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Teste3.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        
        t3.start();
        /*try {
            t3.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Teste3.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        
        try{
        t1.join();
        t2.join();
        t3.join();
        } catch(InterruptedException e){
            e.printStackTrace();
        }
        
        System.out.println("Programa finalizado");
    }

}