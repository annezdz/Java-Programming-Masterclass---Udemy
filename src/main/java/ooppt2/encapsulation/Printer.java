package ooppt2.encapsulation;

public class Printer {
    private String model;
    private int singlePage = 0;
    private int duplexPages = 0;
    private Toner toner;
    private int typePrint;
    private int totalPagesPrinterHistoric;


    public Printer(String model, Toner toner) {
        this.model = model;
        this.singlePage = 0;
        this.duplexPages = 0;
        this.toner = toner;
    }

    public int getSinglePage() {
        return singlePage;
    }

    public int getDuplexPages() {
        return duplexPages;
    }


    public int tonerInicialLevel() {
        return toner.getChargeLevel();
    }

    public int tonerActualValue() {
        int level = tonerInicialLevel();
        if(totalPagesPrinting() >= 10000) {
            level =  10;
        } else if(totalPagesPrinting() >= 7000) {
            level = 40;
        } else if(totalPagesPrinting() >= 4000) {
            level = 70;
        } else if(totalPagesPrinting() >= 1000) {
            level = 90;
        } else {
            level = 95;
        }
        return level;
    }

    public int numberPages(int number) {
        return number;
    }

    public void selectedTypePrint(int typePrint) {
        if(typePrint == 1) {
            duplexPages++;
        } else if (typePrint == 2){
            singlePage++;
        } else {
            System.out.println("Invalid option!");
        }
    }


    public void tonerStatus() {
        if(tonerActualValue() < 2) {
            changeToner();
        } else if (tonerActualValue() < 30) {
            buyToner();
        }
    }

    public void changeToner() {
        System.out.println("Toner with " + tonerActualValue() + " of charge. Change it.");
    }

    public void buyToner() {
        System.out.println("Toner with " + tonerActualValue() + " of charge. " +
                "If you don't have a extra toner it's necessary to buy one or more." );
    }

    public int totalPagesPrinting() {

        return (duplexPages * 2) + singlePage;
    }

    public void totalPagesPrintingMessage () {
        System.out.println("This toner print " + duplexPages + " duplex pages and " + singlePage + " single pages." +
                "The total is " + totalPagesPrinting());
    }

    public int historyPrintPages() {
        return totalPagesPrinterHistoric += (duplexPages * 2 ) + singlePage;
    }


}

