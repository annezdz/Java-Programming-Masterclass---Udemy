package dio;

public class Emprestimo {

    public static void main(String[] args) {

        System.out.println(valorEmprestimo(100.0));
        System.out.println(valorEmprestimo(1000));
        System.out.println(valorEmprestimo(100000));

    }

    public static double valorEmprestimo(double valor) {
        double valorFinal = 0.0D;
       if(valor > 0 && valor < 1000) {
           valorFinal = valor + (valor * 0.05);
       } else if(valor < 10000) {
           valorFinal = valor + (valor * 0.1);
       } else {
           valorFinal = valor + (valor * 0.30);
       }
       return valorFinal;
    }
}
