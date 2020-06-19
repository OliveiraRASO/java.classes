package pt.andre.aula72;

public class Teste {

    public static void main(String[] args) {
        
        TicTac tt = new TicTac() ;
        ThreadTicTac tic = new ThreadTicTac("Tique", tt);
        ThreadTicTac tac = new ThreadTicTac("Taque", tt);
        
        try{
            tic.t.join();
            tac.t.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

}