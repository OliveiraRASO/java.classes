package pt.andre.aula41;

public class Aluno extends Pessoa{
    
    private String cursos;
    private double notas [];
    
    public void verificarAcesso(){
        
        
    }
    
    public Aluno() {
        super();
    }

    public Aluno(String cursos, double[] notas, String nome, String endereco, String telefone, String cpf) {
        super(nome, endereco, telefone, cpf);
        this.cursos = cursos;
        this.notas = notas;
    }
        
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
    
    public double calcularMedia(){
        return 0;
    }
    
    public boolean verificarAprovado(){
        return true;
    }
    
    public String obterEtiquetaEndereco(){        
        String s = "Endereço do aluno: ";
        s += super.getEndereco();
        
        return s;
    }
}
