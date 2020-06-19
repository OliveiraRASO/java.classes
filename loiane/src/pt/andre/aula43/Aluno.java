package pt.andre.aula43;

import java.util.Arrays;
import java.util.Objects;
import pt.andre.aula41.*;

public class Aluno extends Pessoa{
    
    private String cursos;
    private double [] notas;
        
    /*public Aluno() {
        super();
    }

    public Aluno(String cursos, double[] notas, String nome, String endereco, String telefone, String cpf) {
        super(nome, endereco, telefone, cpf);
        this.cursos = cursos;
        this.notas = notas;
    }*/
        
    public String getCursos() {
        return cursos;
    }

    public void setCursos(String cursos) {
        this.cursos = cursos;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
    
    /*public double calcularMedia(){
        return 0;
    }
    
    public boolean verificarAprovado(){
        return true;
    }
    
    @Override
    public String obterEtiquetaEndereco(){        
        String s = "Endereço do aluno: ";
        s += super.getEndereco();
        
        return s;
    }
    
    public String toString(){
        String s = cursos + "\n";
        for (double nota : notas){
            s += nota + " ";
        }
        return s;
    }*/

    @Override
    public String toString() {
        return "Cursos = " + cursos + "\nNotas = " + Arrays.toString(notas);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Aluno other = (Aluno) obj;
        if (!Objects.equals(this.cursos, other.cursos)) {
            return false;
        }
        if (!Arrays.equals(this.notas, other.notas)) {
            return false;
        }
        return true;
    }
    
    
    
}
