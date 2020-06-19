package tp_diurnos;

//@utor: RASO_@2019100463 //Eng_Informática
//Data: 

public class Veiculo {
    
    //
    //variaveis de classe
    private String matricula;
    private String marca;
    private String modelo;
    private double totalKm;
    
    //
    //construtor s/ parametros

    public Veiculo() {
    }

    //
    //construtor c/ parametros
    public Veiculo(String matricula, String marca, String modelo, double totalKm) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.totalKm = totalKm;
    }

    //
    //get-sets
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getTotalKm() {
        return totalKm;
    }

    public void setTotalKm(double totalKm) {
        this.totalKm = totalKm;
    }
    
    //
    //metodo print
    public void print(){
        System.out.print("Matrícula: " + matricula + ", marca: " + marca + ", modelo: " + modelo + ", total de quilómetros: " + totalKm + "Km");
    }

    //
    //metodo toString
    @Override
    public String toString() {
        return "Matrícula: " + matricula + "\n"
                + "Marca: " + marca + "\n"
                + "Modelo: " + modelo + "\n"
                + "Total de quilómetros: " + totalKm + "Km\n";
    }
}