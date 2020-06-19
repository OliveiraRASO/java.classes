package pt.andre.aula44;

public class Mamifero extends Animal{
    
    private String alimento;

    @Override
    public String toString() {
        return super.toString();
    }

    public Mamifero() {
    }

    public Mamifero(String alimento, String nome, String comprimento, int numPatas, String cor, String ambiente, String velocidade) {
        super(nome, comprimento, numPatas, cor, ambiente, velocidade);
        this.alimento = alimento;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }
}