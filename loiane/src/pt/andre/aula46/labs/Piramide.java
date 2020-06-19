package pt.andre.aula46.labs;

public class Piramide extends Fig3d{
    
    private double altura;
    private double arestaBase;
    private double apotema;
    private int numPoliBase;
    
    private Fig2d base;
    

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getArestaBase() {
        return arestaBase;
    }

    public void setArestaBase(double arestaBase) {
        this.arestaBase = arestaBase;
    }

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    public Fig2d getBase() {
        return base;
    }

    public void setBase(Fig2d base) {
        this.base = base;
    }

    @Override
    public double calcularArea() {
        if (base != null){
            return (numPoliBase * (arestaBase * apotema) / 2) + base.calcularArea();
        }
        return 0;
    }

    @Override
    public double calcularVolume() {
        if (getBase() != null){
            return (getBase().calcularArea() * getAltura()) / 3;
        }
        return 0;
    }

    public int getNumPoliBase() {
        return numPoliBase;
    }

    public void setNumPoliBase(int numPoliBase) {
        this.numPoliBase = numPoliBase;
    }
}