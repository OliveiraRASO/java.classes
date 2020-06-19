package pt.andre.aula67;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MinhaThread extends Thread {
    
    private String nome;
    private int tempo;
    
    public MinhaThread(String nome, int tempo){
        this.nome = nome;
        this.tempo = tempo;
        start();
    }
    
    public void run(){
        System.out.println("Executando a Thread");
    try {
        for(int i=0; i<6; i++){
            System.out.println(nome + "contador " + i);
            Thread.sleep(tempo);
        }
        }catch (InterruptedException e) {
                e.printStackTrace();
            }
    }
    }