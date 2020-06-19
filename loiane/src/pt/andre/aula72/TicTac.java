package pt.andre.aula72;

public class TicTac {
    
    boolean tique;
    
    synchronized void tique(boolean estaExecutando){
        
        if (!estaExecutando){
            tique = true;
            notify();
            return;
        }
        
        System.out.print("tique ");
        
        tique = true;
        
        notify();
        
        try{
            while(tique){
                wait();
            }
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    synchronized void taque(boolean estaExecutando){
        
        if (!estaExecutando){
            tique = false;
            notify();
            return;
        }
        
        System.out.println("Taque ");
        
        tique = false;
        
        notify();
        
        try{
            while(!tique){
                wait();
            }
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}