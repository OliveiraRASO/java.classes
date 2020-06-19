package pt.andre.aula44;

public class Peixe extends Animal {
    
    private boolean barbatanas;
    private boolean cauda;

    @Override
    public String toString() {
        return super.toString();
    }

    public Peixe() {
    }

    public Peixe(boolean barbatanas, boolean cauda, String nome, String comprimento, int numPatas, String cor, String ambiente, String velocidade) {
        super(nome, comprimento, numPatas, cor, ambiente, velocidade);
        this.barbatanas = barbatanas;
        this.cauda = cauda;
    }

    public boolean isBarbatanas() {
        return barbatanas;
    }

    public void setBarbatanas(boolean barbatanas) {
        this.barbatanas = barbatanas;
    }

    public boolean isCauda() {
        return cauda;
    }

    public void setCauda(boolean cauda) {
        this.cauda = cauda;
    }

}