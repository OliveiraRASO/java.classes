package pt.andre.aula43;

public class Teste {
    
    public static void main(String[] args) {        
    
    Aluno aluno = new Aluno ();
    
    aluno.setCursos("Informática");
    double [] notas = {4, 5, 15, 2};
    aluno.setNotas(notas);
    
    Aluno aluno2 = new Aluno ();    
    aluno2.setCursos("Matematica");
    double [] notas2 = {4, 5, 15, 2};
    aluno2.setNotas(notas);
    
    System.out.println(aluno);
    
        System.out.println(aluno.equals(aluno2));
  }

}
