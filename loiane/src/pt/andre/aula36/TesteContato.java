package pt.andre.aula36;

public class TesteContato {
    
    public static void main(String[] args) {
        
        Contato contato = new Contato();
        
        contato.setNome("Rúben");
        //contato.setEndereço("Olival");
        //contato.setTelefone("123456789");
        
        //criar objecto endereco        
        Endereco end = new Endereco();
        end.setNomeRua("Sao Martinho");
        end.setNumero("12345");
        end.setComplemento("---");
        end.setCidade("Gaia");
        end.setEstado("Olival");
        end.setCep("9999");
        
        contato.setEndereço(end);
        
        // criar objecto telefone
        Telefone telefone = new Telefone();
        telefone.setNumero("147852369");
        telefone.setTipo("Telemóvel");
        telefone.setCor("Vermelho");
        
        Telefone telefone2 = new Telefone();
        telefone2.setNumero("147852369");
        telefone2.setTipo("Telemóvel");
        telefone2.setCor("Vermelho");
        
        Telefone[] telefones = new Telefone[2];
        telefones[0] = telefone;
        telefones[1] = telefone2;
        
        //contato.setTelefones(telefone);
        contato.setTelefones(telefones);
        
        System.out.println(contato.getNome()); 
        //System.out.println(contato.getTelefone());
        
        if (contato != null && contato.getEndereço()!= null){ //este if para evitar erro no get.endereco
            System.out.println(contato.getEndereço().getCidade());
        }
    
        /*if (contato != null && contato.getTelefones() != null){
            System.out.println(contato.getTelefones().getNumero() + " " + contato.getTelefones().getTipo());
        }*/
        
        if (contato != null && contato.getTelefones() != null){
            for (Telefone t : contato.getTelefones()){
                System.out.println(t.getCor() + " " + t.getNumero() + " " + t.getTipo());
            }
        }
    }
    
    
}
