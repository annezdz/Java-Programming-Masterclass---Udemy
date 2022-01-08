package dio;

public class Calculadora {

    public static void main(String[] args) {
        System.out.println(somar(10,5));
        System.out.println(subtrair(10,5));
        System.out.println(dividir(10,5));
        System.out.println(multiplicar(10,5));


    }

    public static int somar(int numero1, int numero2) {
        return numero1 + numero2;
    }

    public static int subtrair(int numero1, int numero2) {
        return numero1 - numero2;
    }

    public static int dividir(int numero1, int numero2) {
        return numero1 / numero2;
    }

    public static int multiplicar(int numero1, int numero2) {
        return numero1 * numero2;
    }

}
