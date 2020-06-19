package exercicio6;

public class Circulo {
    
    private double x;
    private double y;
    private double raio;

    //
    //construtor
    public Circulo() {
        x = 0;
        y = 0;
        raio = 0;
    }
    
    public Circulo(double x, double y, double raio) {
            this.x = x;
            this.y = y;
            this.raio = raio;
    }
    
    //
    //GET - SETS

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    //
    //metodo para calcular perimetro do circulo
    public double calculaPerimetro(){
        return (2 * Math.PI * getRaio());
    }
    //
    //metodo p/ calcular área do circulo
    public double calculaArea(){
        return (Math.PI * Math.pow(getRaio(), 2));
    }
    //
    //metodo p/ aumentar raio
    public void aumentaRaio( double aumenta){
        raio += aumenta;
    }
    //
    //metodo p/ diminuir raio
    public void diminuiRaio (double diminui){
        raio -= diminui;
    }
    
    //
    //compara raios
    public boolean raioMaior(Circulo circulo){
        return raio > circulo.raio ? true : false;
    }
    //
    //metodo printa
    public void escreveCirculo(){
        System.out.println("Centro (" + x + ", " + y + ")");
        System.out.println("Raio " + raio);
    }
    
    //
    //metodo to string
    @Override
    public String toString() {
        String string = "";
        string = "Centro (" + x + ", " + y + "), Raio: " + raio;
        return string;
    }
}