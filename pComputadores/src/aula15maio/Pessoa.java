package aula15maio;

//@utor: RASO //Eng_Informática
//Data: 15/04/2020

public class Pessoa {
    
    //
    //variavel de classe
    private static String nacionalidade;
    
    //
    //variaveis de instancia
    public String nome;
    public String morada;
    public int idade;
    public int nif;

    //
    //construtores
    public Pessoa() {
        nacionalidade = "Portugal";
        nome = "";
        morada = "";
        idade = 0;
        nif = 0;
    }
    
    //
    //construtor com parametros
    public Pessoa(String nome, String morada, int idade, int nif){
        nacionalidade = "Portugal";
        this.nome = nome;
        this.morada = morada;
        this.idade = idade;
        this.nif = nif;
    }
    
    //
    //metodos de classe - apenas atuam sobre as variaveis de classe
    public static void getNacionalidade(String n){
        nacionalidade = n;
    }
    
    public static String getNacionalidade(){
        return nacionalidade;
    }
    
    //
    //get sets - metodos de instancia
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) { // metodo modificador
        this.nome = nome;
    }
    public String getMorada() {
        return morada;
    }
    public void setMorada(String morada) {
        this.morada = morada;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getNif() {
        return nif;
    }
    public void setNif(int nif) {
        this.nif = nif;
    }
    
    //
    //metodo que compara a idade entre duas pessoas
    public boolean maisVelha( Pessoa p ){
       if( this.idade > p.idade )
            return true;
        else
            return false;
    }
    
    //
    // metodo para escrever as variaveis privadas 
    public void print(){
        System.out.println("O nome da pessoa é: " + nome);
        System.out.println("A morada da pessoa é: " + morada);
        System.out.println("A idade da pessoa é: " + idade);
        System.out.println("O NIF da pessoa é: " + nif);
        System.out.println("A nacionalidade da pessoa é: " + nacionalidade);
    }
    
    @Override // sobreposição (override) do método toString
    public String toString() {
        return "" + nome + morada + idade + nif;
    }
}