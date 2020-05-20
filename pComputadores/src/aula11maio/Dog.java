package aula11maio;

//@utor: RASO //Eng_Informática
//Data: 

public class Dog {

    //
    //variavel de classe
    private static int dogCounter = 0;
    
    // variáveis de instância
    private String breed;
    private String size;
    private int age;
    private String color;
    
    // construtores
    public Dog() {
        breed = "";
        size = "";
        age = 0;
        dogCounter++;
    }
    public Dog(String breed, String size, int age, String color) {
        this.breed = breed;
        this.size = size;
        this.age = age;
        this.color = color;
        dogCounter++;
    }
    
    // métodos de acesso
    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
            this.age = age;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    
    // outros métodos de instância
    @Override
    public String toString(){
        return "" + breed + ", " + size + " ," + age + " ," + color;
    }
    
    //
    //metodo verifica mesma raça
    public boolean sameBreed(Dog d){
        return breed.equals(d.breed);
    }
    
    public static int getdogCounter(){
        return dogCounter;
    }
    
    public void print(){
        System.out.println("Breed: " + breed );
        System.out.println("Size : " + size  );
        System.out.println("Age  : " + age   );
        System.out.println("Color: " + color );
        
    }
}