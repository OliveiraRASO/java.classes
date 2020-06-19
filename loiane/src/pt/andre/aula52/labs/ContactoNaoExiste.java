package pt.andre.aula52.labs;

public class ContactoNaoExiste extends Exception{
    
    private String nomeContatco;

    public ContactoNaoExiste(String nomeContacto) {
        this.nomeContatco = nomeContacto;
    }

    @Override
    public String getMessage() {
        return "Contacto " + nomeContatco + " não existe na agenda!"; 
    }
    
    
}