package pt.andre.aula37;

public class Professor extends Pessoa{
    
    private String nomeCurso;
    private double salario;

    public Professor() {
        System.out.println("This is basic Professor contructor with parameters");

    }

    public Professor(String nomeCurso, double salario) {
        this.nomeCurso = nomeCurso;
        this.salario = salario;
        System.out.println("This is basic professor contructor");

    }

    public Professor(String nomeCurso, double salario, String nome, String endereco, String telefone, String cpf) {
        super(nome, endereco, telefone, cpf);
        this.nomeCurso = nomeCurso;
        this.salario = salario;
        System.out.println("This is Professor contructor with parameters with super constructor");

    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public double calcularSalarioLiquido(){
        return 0;
    }
    
}
