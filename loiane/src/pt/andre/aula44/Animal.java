package pt.andre.aula44;

public class Animal {
    
    private String nome;
    private String comprimento;
    private int numPatas;
    private String cor;
    private String ambiente;
    private String velocidade;

    @Override
    public String toString() {
        return super.toString();
    }

    public Animal() {
    }

    public Animal(String nome, String comprimento, int numPatas, String cor, String ambiente, String velocidade) {
        this.nome = nome;
        this.comprimento = comprimento;
        this.numPatas = numPatas;
        this.cor = cor;
        this.ambiente = ambiente;
        this.velocidade = velocidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getComprimento() {
        return comprimento;
    }

    public void setComprimento(String comprimento) {
        this.comprimento = comprimento;
    }

    public int getNumPatas() {
        return numPatas;
    }

    public void setNumPatas(int numPatas) {
        this.numPatas = numPatas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public String getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(String velocidade) {
        this.velocidade = velocidade;
    }
    
    public String obterInfo(){
        String s = "";
        s += "Nome: " + getNome();
        s += "\nComprimento: " + getComprimento();
        s += "\nCor: " + getCor();
        s += "\nNúmero de patas: " + getNumPatas();
        s += "\nVelocidade: " + getVelocidade();
        
        return s;
    }
    

}