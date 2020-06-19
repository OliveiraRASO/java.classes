package pt.andre.aula36.labs;

import java.util.Scanner;

public class TesteEx01 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o nome da Agenda ");
        String nome = scan.nextLine();
        
        Agenda agenda = new Agenda();
        
        Contato[] contatos = new Contato[3];
        
        for (int i=0; i<3; i++){
            System.out.println(nome + ", digite as infos do contato "+(i+1));
            Contato c = new Contato();
            
            System.out.println("Digite o nome: ");
            nome = scan.nextLine();
            c.setNome(nome);
            
            System.out.println("Digite o telefone: ");
            String telefone = scan.nextLine();
            c.setTelefone(telefone);
            
            System.out.println("Digite o email: ");
            String email = scan.nextLine();
            c.setEmail(email);
               
            contatos[i] = c;
        }      
        
        agenda.setContatos(contatos);
        
        if (agenda != null){
            System.out.println(agenda.obterInfo());
        }        
       
    }
    
}
