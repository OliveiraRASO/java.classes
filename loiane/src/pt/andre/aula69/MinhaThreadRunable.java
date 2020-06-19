package pt.andre.aula69;

public class MinhaThreadRunable implements Runnable{
    
    private String nome;
    private int tempo;
    
    public MinhaThreadRunable(String nome, int tempo){
        this.nome = nome;
        this.tempo = tempo;
    }
    
    @Override
    public void run() {
        try {
            for(int i=0; i<6; i++){
                System.out.println(nome + "contador" + i);
                Thread.sleep(tempo);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        
        System.out.println(nome + "Terminou a execução");
    }

}