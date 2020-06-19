package pt.andre.aula46.labs;

public class Quadrado extends Fig2d{
    
    private int lado;

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        //return lado * lado;
        return Math.pow(lado, 2);
    }

}