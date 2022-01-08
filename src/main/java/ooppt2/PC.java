package ooppt2;

public class PC {

    private Case theCase;
    private Monitor monitor;
    private MotherBoard motherBoard;

    public PC(Case theCase, Monitor monitor, MotherBoard motherBoard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherBoard = motherBoard;
    }

    /**
     *
     * Ao invés de deixar os Getters públicos, podemos acessar os métodos da Classe Monitor e da classe Case
     * através de um método público que , no caso do Case, pressiona o botão Power e carrega o Logo e no
     * caso do Monitor com o método drawLogo() inicializa o monitor.drawPixelArt.*/
    public void powerUp() {
        theCase.pressPowerButton();
        drawLogo();
    }

    public void drawLogo() {
        //Fancy graphics
        monitor.drawPixelArt(1200,50,"yellow");
    }
//
//    private Case getTheCase() {
//        return theCase;
//    }
//
//    private Monitor getMonitor() {
//        return monitor;
//    }
//
//    private MotherBoard getMotherBoard() {
//        return motherBoard;
//    }
}
