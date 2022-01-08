package dio;

public class HoraDia {
    public static void main(String[] args) {
        saudacao(5);
        saudacao(12);
        saudacao(11);
    }

    public static void saudacao(int hora) {
        if(hora >= 6 && hora < 12) {
            System.out.println("Bom dia!");
        } else if(hora >= 12 && hora < 18) {
            System.out.println("Boa tarde");
        } else {
            System.out.println("Boa noite");
        }
    }
}
