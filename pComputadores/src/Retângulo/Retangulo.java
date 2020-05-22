package Retangulo;

//@utor: RASO_2019100463 //Eng_Informática
//Data: 18/05/2020

public class Retangulo {

    private double x1 = 0;
    private double y1 = 0;
    private double x2 = 0;
    private double y2 = 0;

    public Retangulo() {
            super();
    }

    public Retangulo(double x1, double y1, double x2, double y2) {
            super();
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
    }

    // GET//SETS
    public double getX1() {
            return x1;
    }
    public void setX1(double x1) {
            this.x1 = x1;
    }
    public double getX2() {
            return x2;
    }
    public void setX2(double x2) {
            this.x2 = x2;
    }
    public double getY1() {
            return y1;
    }
    public void setY1(double y1) {
            this.y1 = y1;
    }
    public double getY2() {
            return y2;
    }
    public void setY2(double y2) {
            this.y2 = y2;
    }
    //
    //metodos de calculo
    public double calcBase() {
            return (getX2() - getX1());
    }
    public double calcAltura() {
            return (getY2() - getY1());
    }
    public double calcPerimetro() {
            return (getX1() + getX2() + getY1() + getY2());
    }
    public double calcArea() {
            return (calcBase() * calcAltura());
    }
}
