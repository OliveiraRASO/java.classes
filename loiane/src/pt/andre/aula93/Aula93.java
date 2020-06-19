package pt.andre.aula93;

import java.time.LocalDate;
import java.time.Month;

public class Aula93 {

    public static void main(String[] args) {
        
        // data dd MM yyyy
        LocalDate agora = LocalDate.now();
        System.out.println(agora);
        
        System.out.println(LocalDate.of(2019, Month.SEPTEMBER, 1));
        System.out.println(LocalDate.parse("2019-12-01"));
        
        System.out.println("plus 30");
        System.out.println(agora.plusDays(1));
        
        System.out.println(agora.getDayOfWeek());

    }
}