package pt.andre.aula52.labs;

public class Agenda extends Contacto{
    
    private Contacto[] contactos;
    
    public Agenda(){
        contactos = new Contacto[5];
    }
    
    public void adicionarContacto(Contacto c) throws AgendaCheiaException{
        
        boolean cheia = true;
        for (int i=0; i<contactos.length; i++){
            if (contactos[i] == null){
                contactos[i] = c;
                cheia = false;
                break;
            }
        }
        
        if (cheia){
            throw new AgendaCheiaException();
        }
    }
    
    public int consultaContactoPorNome(String nome) throws ContactoNaoExiste{
        for (int i=0; i<contactos.length; i++){
            if (contactos[i] != null){
                if (contactos[i].getNome().equalsIgnoreCase(nome)){
                    return i;
                }
            }
        }
        throw new ContactoNaoExiste(nome);
    }

    @Override
    public String toString() {
        String s = "";
        for (Contacto c : contactos){
            if (c != null){
                s += c.toString() + "\n";
            }
            
        }
        return s;
    }
}