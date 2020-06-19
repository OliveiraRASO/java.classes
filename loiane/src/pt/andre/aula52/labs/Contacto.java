package pt.andre.aula52.labs;

public class Contacto {
    
    private static int contador;
    
    private int id;
    private String nome;
    private String telefone;
    private String email;
    
    public Contacto(){
        contador++;
        id = contador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        String s = "[";
        s += "ID: " + id;
        s += ", Nome: " + nome;
        s += ", Email: " + email;
        
        return s;
    }
    
    

}