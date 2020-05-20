package aula15maio;

//@utor: RASO //Eng_Informática
//Data: 15/05/2020

import java.util.*;

public class Pessoas {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        
        boolean flag = false;
        Pessoa [] v = new Pessoa[4];
        int opcao;
        
        do{
            System.out.print("1 - Inserir pessoas\n"
                    + "2 - Listar pessoas\n"
                    + "3 - Alterar pessoas\n"
                    + "4 - Alterar nacionalidade\n"
                    + "5 - Comparar idades\n");
            opcao = leia.nextInt();
        
            switch(opcao){
                case 1:
                    for(int i=0+1; i<v.length; i++){
                        System.out.println("Digite o nome da pessoa: " + i);
                        v[i] = new Pessoa();
                        v[i].setNome(leia.nextLine());
                        leia.nextLine();
                        System.out.println("Digite a morada da pessoa: ");
                        v[i].setMorada(leia.nextLine());
                        System.out.println("Digite a idade da pessoa: ");
                        v[i].setIdade(leia.nextInt());
                        System.out.println("Digite o NIF da pessoa: ");
                        v[i].setNif(leia.nextInt());
                    }
                    break;
                case 2:
                    for(int i=0+1; i<v.length; i++){
                        System.out.println(v[i].getNome());
                        System.out.println(v[i].getMorada());
                        System.out.println(v[i].getIdade());
                        System.out.println(v[i].getNif());
                    }
                    break;
                case 3:
                    for(int i=0; i<v.length; i++){
                        System.out.println("Digite o nome: ");
                        v[i].setNome(leia.nextLine());
                        System.out.println("Digite a morada: ");
                        v[i].setMorada(leia.nextLine());
                        System.out.println("Digite a idade: ");
                        v[i].setIdade(leia.nextInt());
                        System.out.println("Digite o NIF: ");
                        v[i].setNif(leia.nextInt());
                    }
                    break;
                case 4:
//                    for(int i=0; i<v.length; i++){
//                        System.out.println(v[i].setNacionalidade(leia.nextLine()));
//                    }
                    break;
                case 5:
                    if(v[0].getIdade() > v[1].getIdade()){
                        System.out.println(v[0].getNome() + " é mais velha que " + v[1].getNome());
                    }else{
                        System.out.println(v[1].getNome() + " é mais velha que " + v[0].getNome());
                    }
            }
        }while(opcao != 9);
    }
}