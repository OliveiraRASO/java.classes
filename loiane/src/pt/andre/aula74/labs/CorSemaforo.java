
package pt.andre.aula74.labs;

public enum CorSemaforo {
    
    VERDE(1000), AMARELO(300), VERMELHO(2000);
    
    private int tempoEspera;

    private CorSemaforo(int tempoEspera) {
        
    }

    public int getTempoEspera() {
        return tempoEspera;
    }

}
