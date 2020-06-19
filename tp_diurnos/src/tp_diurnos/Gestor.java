package tp_diurnos;

//@utor: RASO_@2019100463 //Eng_Informática
//Data: 

import java.util.*;

public class Gestor {

    public static void main(String[] args) {
        
        //
        //separador de linhas
        char a = '=';
        char [] separador = new char [40];
        Arrays.fill(separador, a);
        
        //
        //cria instancia AUTOMOVEL l
        Automovel automovel1 = new Automovel("AA-BB-00", "Carro", "Anda muito", 2500, 9, 75);
        Automovel automovel2 = new Automovel("CC-DD-11", "Carro", "Anda pouco", 1500, 5, 55);
        
        //
        //printa dados instancia AUTOMOVEL 1 c/ metodo Sys.out
        System.out.println(separador);
        System.out.println("Apresenta dados c/ método Sys.out...");
        System.out.print("Automóvel 1 --> ");
        automovel1.print();
        //
        //printa dados instancia AUTOMOVEL 1 c/ metodo Sys.out
        System.out.print("Automóvel 2 --> ");
        automovel2.print();
        System.out.println(separador);
        System.out.println();
        
        //
        //printa dados instancia AUTOMOVEL 1 c/ metodo toString
        System.out.println("Apresenta dados c/ método toString...");
        System.out.println(separador);
        System.out.println("Automóvel 1: ");
        System.out.println(automovel1.toString());
        //
        //printa dados instancia AUTOMOVEL 2 c/ metodo toString
        System.out.println("Automóvel 2: ");
        System.out.println(automovel2.toString());
        
        //
        //printa comparação de quilometros
        System.out.println(separador);
        System.out.println("Após comparação de Km entre os dois automóveis...\n"
                + " '1' = automóvel 1\n"
                + "'-1' = automóvel 2\n"
                + " '0' = mesma quilometragem");
        System.out.println(automovel1.comparaKm(automovel2));
        
        //----------------------
        //----------------------
        //cria instancia VEICULO
        Veiculo veiculo1 = new Veiculo("EE-FF-33", "Carro", "Faz fumo", 500);
        Veiculo veiculo2 = new Veiculo();
        veiculo2.setMarca("Carro");
        veiculo2.setMatricula("GG-HH-44");
        veiculo2.setModelo("Sem fumo");
        veiculo2.setTotalKm(1000);
        
        //
        //----------------------
        System.out.println(separador);
        System.out.println(separador);
        System.out.println();
        System.out.println("Dados da instancia veiculo");
        
        //
        //printa dados instancia VEICULO 1 c/ metodo Sys.out
        System.out.println(separador);
        System.out.println("Apresenta dados c/ método Sys.out...");
        System.out.print("Veículo 1 --> ");
        veiculo1.print();
        System.out.println();
        
        //
        //printa dados instancia VEICULO 2 c/ metodo Sys.out
        System.out.print("Veículo 2 --> ");
        System.out.println("Matrícula: " + veiculo2.getMatricula() + ", marca: " + veiculo2.getMarca() + ", modelo: " 
                +  veiculo2.getModelo() + ", total de quilómetros: " + veiculo2.getTotalKm() + "Km");
        System.out.println();
        
        //
        //printa dados instancia VEICULO 1 c/ metodo toString
        System.out.println("\nApresenta dados c/ método toString...");
        System.out.println(separador);
        System.out.println("Veículo 1: ");
        System.out.println(veiculo1.toString());
        
        //
        //printa dados instancia VEICULO 2 c/ metodo toString
        System.out.println();
        System.out.println("Veículo 2: ");
        System.out.println(veiculo2.toString());
    }
}