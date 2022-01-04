package controlFlowsStatements;

public class NumcerOfDaysInMonth {
    public static void main(String[] args) {

        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year / 100 != 0 && year > 0 && year < 9999) ? true : false;
    }
}

