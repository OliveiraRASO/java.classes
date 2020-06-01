package Projeto5;

//@utor: RASO_@2019100463 //Eng_Informática
//Data: 29/05/2020

public class Professor extends Pessoa{
    
    //
    //variaveis de instancia
    private int grupoDocencia;
    private int escalaoProfessor;
    
    //
    //construtor vazio
    public Professor() {
        grupoDocencia = 0;
        escalaoProfessor = 0;
    }
    
    //
    //construtor com parametros da super e sub classe
    public Professor(String nome, char genero, int idade, int grupoDocencia, int escalaoProfessor) {
        super(nome, genero, idade);
        this.grupoDocencia = grupoDocencia;
        this.escalaoProfessor = escalaoProfessor;
    }
    
    //
    //GET
    public int getGrupoDocencia() {
        return grupoDocencia;
    }
    public int getEscalaoProfessor() {
        return escalaoProfessor;
    }
    
    //
    //metodo sobreescrito falar
    @Override
    public void falar(){
        super.falar();
        System.out.println(" e sou um professor.");
    }

    @Override
    public String toString() {
        return super.toString() + grupoDocencia + ":" + escalaoProfessor;
    }   
}