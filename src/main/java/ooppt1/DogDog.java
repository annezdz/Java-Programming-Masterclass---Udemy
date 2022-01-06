package ooppt1;

public class DogDog {

    private static String name;

    public DogDog(String name) {
        DogDog.name = name;
    }

    public void printName() {
        System.out.println("name = " + name);
    }
}

class Main1 {
    public static void main(String[] args) {

        /**
         * A cada novo objeto criado, porque eles compartilham a mesma variavel do construtor
         * todos os objetos, quando chamado o método printName(), terão o mesmo retorno.
         * No caso, todos terão esse retorno
         * name = pushy
         * name = pushy
         * name = pushy
         * */

        DogDog rex = new DogDog("Rex");
        DogDog fluffy = new DogDog("fluffy");

        DogDog pushy = new DogDog("pushy");
        rex.printName();
        fluffy.printName();
        pushy.printName();
    }
}
