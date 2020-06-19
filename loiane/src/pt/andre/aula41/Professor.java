package pt.andre.aula41;

public class Professor extends Pessoa{
    
    private String nomeCurso;
    private double salario;

    public Professor() {
        super();
    }

    public Professor(String nomeCurso, double salario, String nome, String endereco, String telefone, String cpf) {
        super(nome, endereco, telefone, cpf);
        this.nomeCurso = nomeCurso;
        this.salario = salario;
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
    
    public String obterEtiquetaEndereco(){
        String s = "A morada do professor é: ";
        s += super.getEndereco();
        
        return s;
    }
    
}
