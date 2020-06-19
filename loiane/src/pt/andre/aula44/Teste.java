package pt.andre.aula44;

public class Teste {

    public static void main(String[] args) {
        
        System.out.println("*** Zoo Laptop ***");
        System.out.println("----------------------");
        
        Animal camelo = new Animal();
        camelo.setNome("Camelo");
        camelo.setComprimento("150");
        camelo.setNumPatas(4);
        camelo.setCor("Amarelo");
        camelo.setAmbiente("Terra");
        camelo.setVelocidade("2.0 m/s");
        
        System.out.println(camelo.obterInfo());
        System.out.println("----------------------");
        
        Animal tubarao = new Animal();
        tubarao.setNome("Tubarão");
        tubarao.setComprimento("300cm");
        tubarao.setNumPatas(0);
        tubarao.setCor("Cinzento");
        tubarao.setAmbiente("Mar");
        
        System.out.println(tubarao.obterInfo());
        System.out.println("----------------------");
        
        Animal ursoCanada = new Animal();
        ursoCanada.setNome("Urso do Canadá");
        ursoCanada.setComprimento("180cm");
        ursoCanada.setNumPatas(4);
        ursoCanada.setCor("Vermelho");
        ursoCanada.setAmbiente("Terra");
        ursoCanada.setVelocidade("0.5 m/s");
        
        System.out.println(ursoCanada.obterInfo());
    }

}