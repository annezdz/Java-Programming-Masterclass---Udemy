package ooppt1;

public class DogDogDog {

    private String name;


    public DogDogDog(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println("name =" + name);
    }
}
class Main4 {
    public static void main(String[] args) {

        DogDogDog rex = new DogDogDog("Rex");
        DogDogDog fluffy = new DogDogDog("fluffy");
        DogDogDog pushy = new DogDogDog("pushy");
        rex.printName();
        fluffy.printName();
        pushy.printName();
    }
}
