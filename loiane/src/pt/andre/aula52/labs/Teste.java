package pt.andre.aula52.labs;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Teste {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Agenda agenda = new Agenda();
        
        int opcao = 1;
        while (opcao != 3){
            opcao = obterOpcaoMenu(scan);
            
            if (opcao == 1){ //consultar contatco
            consultarContacto(scan, agenda);
            } else if (opcao == 2){ //adicionar contatco
                adicionarContacto(scan, agenda);
            } else {//sair
                System.exit(0);
            }
        }
    }
    
    public static void consultarContacto(Scanner scan, Agenda agenda){
        String nomeContacto = lerInformacaoString(scan, "Digite o nome do contatco a pesquisar: ");
            try {
                if (agenda.consultaContactoPorNome(nomeContacto) >= 0){
                    System.out.println("Contacto existe.");
                }
            } catch (ContactoNaoExiste e) {
                System.out.println(e.getMessage());
            }
    }
    
    public static void adicionarContacto(Scanner scan, Agenda agenda){
        try {
            System.out.println("Criando um contacto, digite as informações.");
            String nome = lerInformacaoString(scan, "Digite o nome: ");
            String telefone = lerInformacaoString(scan, "Digite o telefone: ");
            String email = lerInformacaoString(scan, "Digite o email: ");
            
            Contacto contacto = new Contacto();
            contacto.setNome(nome);
            contacto.setEmail(email);
            contacto.setTelefone(telefone);
            
            System.out.println("Contacto a ser criado: ");
            System.out.println(contacto);
            
            agenda.adicionarContacto(contacto);
        } catch (AgendaCheiaException e) {
            System.out.println(e.getMessage());
            
            System.out.println("Contatos agenda.");
            System.out.println(agenda);
        }
    }
    
    public static String lerInformacaoString(Scanner scan, String msg){
        System.out.println("Digite o nome do contatco a pesquisar");
        String entrada = scan.nextLine();
        return entrada;
    }
    
    public static int obterOpcaoMenu(Scanner scan){

    boolean entradaValida = false;
    int opcao = 3;

    while (!entradaValida){
        System.out.println("1: Consultar contacto.");
        System.out.println("2: Adicionar contacto.");
        System.out.println("3: Sair.");

        try{
            String entrada = scan.nextLine();
            opcao = Integer.parseInt(entrada);

        if (opcao == 1 | opcao == 2 | opcao == 3){
            entradaValida = true;
        } else {
            throw new Exception("Entrada inválida!");
        }
      }
        catch (Exception e){
            System.out.println("Entrada inválida, digite novamente!");
        }
    }
    return opcao;
      }
    }