package ooppt2.encapsulation;

public class Main {
    public static void main(String[] args) {

//        Player player = new Player();
//        player.name = "Anne";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("remaining health = " + player.healthRemaining());
//        damage = 11;
//        System.out.println("remaining health = " + player.healthRemaining());

//        EnhancedPlayer player = new EnhancedPlayer("Tim",50,"Sword");
//        System.out.println("Initial health is " + player.getHealth());

        Toner toner = new Toner(true);
//        toner.getChargeLevel();
//        toner.isColored();

        Printer printer = new Printer("Epson Stylus",toner);
      //  printer.tonerStatus();
        printer.tonerInicialLevel();
        printer.selectedTypePrint(1);
        printer.selectedTypePrint(1);
        printer.selectedTypePrint(1);
        printer.selectedTypePrint(2);
        printer.totalPagesPrintingMessage();
        System.out.println(printer.historyPrintPages());
        System.out.println(printer.tonerActualValue());
       // printer.tonerStatus();

    }
}
