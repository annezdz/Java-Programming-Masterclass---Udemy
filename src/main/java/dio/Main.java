package dio;

public class Main {
    public static void main(String[] args) {
////        prePos();
//
//        byte b1;
//        short s1 = 1000;
//        b1 = (byte) s1;
//        System.out.println(b1); // -24, ou seja, houve perda de informação (downcast)
//
//        long l1;
//        int i1 = 10;
//        l1 = i1;
//
//        System.out.println(l1); // é um upcast, ou seja, não há perda de informações
//
//        int i2;
//        long l2 = 1000000000000000L;
//        i2 = (int) l2;
//        System.out.println(i2); // também é um downcast
//
//        int i3;
//        long l3 = 100000L;
//        i3 = (int) l3;
//        System.out.println(i3);
//
//        //upcast de numeros reais
//
//        double d1;
//        float f1 = 10.5F;
//        d1 = f1;
//        System.out.println(d1);
//
//        float f2;
//        float f3;
//        double d2 = 10000.50D;
//        f2 = (float) d2;
//        System.out.println(f2); // downcast sem perda de dados
//        double d3 = 10000.5888888888888888888888888888888888888888888888888888888888888888888888D; // downcast com perda de dados
//        f3 = (float) d3;
//        System.out.println(f3); //10000.589
//        byte b3 = (byte) d3;
//        System.out.println(b3); // downcast entre inteiro e fracionado

//        // Calculadora
//        System.out.println("Exercício calculadora");
//        Calculadora2.soma(3, 6);
//        Calculadora2.subtracao(9, 1.8);
//        Calculadora2.multiplicacao(7, 8);
//        Calculadora2.divisao(5, 2.5);
//
//        // Mensagem
//        System.out.println("Exercício mensagem");
//        Mensagem.obterMensagem(9);
//        Mensagem.obterMensagem(14);
//        Mensagem.obterMensagem(1);
//
//        // Empréstimo
//        System.out.println("Exercício empréstimo");
//        Emprestimo2.calcular(1000, Emprestimo2.getDuasParcelas());
//        Emprestimo2.calcular(1000, Emprestimo2.getTresParcelas());
//        Emprestimo2.calcular(1000, 5);

        // Quadrilatero

        Quadrilatero.calculoArea(2,2);
        Quadrilatero.calculoArea(3,4);
        Quadrilatero.calculoArea(2,2,2);
    }

//    public static void prePos() {
//        int k = 10;
//        int i = ++k;
//        int j = k--;
//        int x = k;
//        System.out.println("i " + i);
//        System.out.println("j " + j);
//        System.out.println("x " + x);

}
