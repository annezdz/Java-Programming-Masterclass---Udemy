package firstSteps;

public class IfElseAndOr {
    public static void main(String[] args) {
        boolean isAlien = false;
        if(isAlien == false){
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens");
        }

        int topScore = 80;
        if(topScore != 100){
            System.out.println("You got the high score!");
        }

        int secondTopScore = 81;
        if((topScore > secondTopScore) && (topScore < 100))
        {
            System.out.println("Greater than second top score and les than 100.");
        }

        /**
         * & is a bitwise operator working at the bit level
         * **/

        if ((topScore > 90) || (secondTopScore <= 90)) {

            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if(newValue == 50){
            System.out.println("This is true");
        }

        boolean isCar = false;
        if(isCar){
            System.out.println("This is not supposed to happen");
        }


    }
}
