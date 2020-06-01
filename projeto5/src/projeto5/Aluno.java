package Projeto5;

//@utor: RASO_@2019100463 //Eng_Informática
//Data: 29/05/2020

public class Aluno extends Pessoa{
    
    //
    //variaveis de instancia
    private int numero;
    private String turma;

    //
    //construtor vazio
    public Aluno() {
        numero = 0;
        turma = "";
    }
    
    //
    //construtor com parametros de super e sub classe
    public Aluno(String nome, char genero, int idade, int numero, String turma) {
        super(nome, genero, idade);
        this.numero = numero;
        this.turma = turma;
    }
    
    //
    //GET
    public int getNumero() {
        return numero;
    }
    public String getTurma() {
        return turma;
    }
    
    //
    //metodo falar sobreescrito
    @Override
    public void falar(){
        super.falar();
        System.out.println(" e sou um aluno.");
    }

    @Override
    public String toString() {
        return super.toString() + numero + ":" + turma;
    }
}