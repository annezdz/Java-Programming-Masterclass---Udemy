package ooppt2.encapsulation.timResolution;

public class Main {

    public static void main(String[] args) {

        Printer printer = new Printer(50,true);
        System.out.println("Initial page count = " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer is : "
                + printer.getPagesPrinted());
        pagesPrinted = printer.printPages(7);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer is : "
                + printer.getPagesPrinted());

        System.out.println(printer.addToner(50));
    }
}
