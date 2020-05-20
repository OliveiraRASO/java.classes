package aula11maio;

//@utor: RASO //Eng_Informática
//Data: 

import java.util.*;

public class Dogs {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        
        Dog d = new Dog();
        Dog d2 = new Dog();
        
        d.setBreed("doberman");
        d.setSize("big");
        d.setAge( 5 );
        d.setColor("black");
        
        d2.setBreed("Pitbull");
        d2.setSize("big");
        d2.setAge( 5 );
        d2.setColor("black");
        
        d.print();
        
        //compara raças
        if(d.sameBreed(d2)){
            System.out.println("São da mesma raça.");
        }else{
            System.out.println("Não são da mesma raça.");
        }
        
        System.out.println("Número de objectos criados: " + Dog.getdogCounter());
        
    }
}