package pt.andre.aula41;

public class Pessoa {
    
    private String nome;
    private String endereco;
    private String telefone;
    private String cpf;

    public Pessoa() {
    }

    public Pessoa(String nome, String endereco, String telefone, String cpf) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cpf = cpf;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public String obterEtiquetaEndereco(){
        
        return endereco;
    }
    
}
