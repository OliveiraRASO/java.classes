package tp_diurnos;

//@utor: RASO_@2019100463 //Eng_Informática
//Data: 

public class Automovel extends Veiculo{
    
    //
    //variaveis de classe
    private int numeroLugares;
    private double capacidadeMalaLitros;
    
    //
    //construtor s/ parametros
    public Automovel() {
    }

    //
    //construtor c/ parametros
    public Automovel(String matricula, String marca, String modelo, double totalKm, int numeroLugares, double capacidadeMalaLitros) {
        super(matricula, marca, modelo, totalKm);
        this.numeroLugares = numeroLugares;
        this.capacidadeMalaLitros = capacidadeMalaLitros;
    }
    
    //
    //get-sets
    public int getNumeroLugares() {
        return numeroLugares;
    }

    public void setNumeroLugares(int numeroLugares) {
        this.numeroLugares = numeroLugares;
    }

    public double getCapacidadeMalaLitros() {
        return capacidadeMalaLitros;
    }

    public void setCapacidadeMalaLitros(double capacidadeMalaLitros) {
        this.capacidadeMalaLitros = capacidadeMalaLitros;
    }
    
    //
    //metodo print
    public void print(){
        super.print();
        System.out.println(", número de lugares: " + numeroLugares + ", capacidade de litros: " + capacidadeMalaLitros + "L");
    }
    
    //
    //metodo compara quilometros
    public int comparaKm(Automovel automovel){
        //boolean flag = false;
        if(getTotalKm() > automovel.getTotalKm()){
            System.out.println("O automóvel 1 tem mais Km.");
            System.out.print("Resultado => ");
            return 1;
        }else if(getTotalKm() < automovel.getTotalKm()){
            System.out.println("O automóvel 2 tem mais Km.");
            System.out.print("Resultado => ");
            return -1;
        }else{
            System.out.println("Os 2 automóveis possuem a mesma quilometragem.");
            System.out.print("Resultado => ");
            return 0;
        }
    }

    //
    //metodo toString
    @Override
    public String toString() {
        return super.toString() + "Número de lugares: " + numeroLugares + "\n"
                + "Capacidade de mala: " + capacidadeMalaLitros + "L\n";
    }
}