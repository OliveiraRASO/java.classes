package aula11maio;

//@utor: RASO //Eng_Informática
//Data: 

import java.util.*;

public class Dogs {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        
        Dog d = new Dog();
        
        d.setBreed("doberman");
        d.setSize("big");
        d.setAge( 5 );
        d.setColor("black");
              
        System.out.println(d);
        
        System.out.println("");
        
        d.print();
    }
}