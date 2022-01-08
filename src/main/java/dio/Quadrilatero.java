package dio;

public class Quadrilatero {

    public static void calculoArea(double base, double altura) {
        double area = base * altura;
        if(base == altura) {
            System.out.println("A area do quadrado com base " + base + " altura " + altura + " é : " + area);
        } else {
            System.out.println("A area do retangulo com base " + base + " altura " + altura + " é : " + area);
        }
    }

    public static void calculoArea(double baseA, double baseB, double altura) {
        double resultado = ((baseA + baseB) / 2) * altura;
        System.out.println("A area do trapézio com bases " + baseA + " , " + baseB + " e altura " + altura + " é: " + resultado );
    }
}
