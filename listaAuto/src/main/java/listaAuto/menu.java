package listaAuto;

public class menu {
    
    public static void menuPrincipal(){
        
        String menu_list[] = {"#1 - [Motor]", "#2 - [Travões]", "#3 - [Carroçaria]"};
        
        for(int i=0; i<menu_list.length; i++){
            System.out.println(menu_list[i]);
        }
    }

}