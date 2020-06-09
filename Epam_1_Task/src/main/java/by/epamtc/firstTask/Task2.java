package by.epamtc.firstTask;

public class Task2 {

    public static void main(String[] args) {
        //1-st method
        int value = 282;

        if (value <= 31) {
            System.out.println("Date: " + value + ".01");
        } else if (value <= 59) {
            System.out.println("Date: " + (value - 31) + ".02");
        } else if (value <= (59 + 31)) {
            System.out.println("Date: " + (value - 59) + ".03");
        } else if (value <= (90 + 30)) {
            System.out.println("Date: " + (value - 90) + ".04");
        } else if (value <= (120 + 31)) {
            System.out.println("Date: " + (value - 120) + ".05");
        } else if (value <= (151 + 30)) {
            System.out.println("Date: " + (value - 151) + ".06");
        } else if (value <= (181 + 31)) {
            System.out.println("Date: " + (value - 181) + ".07");
        } else if (value <= (212 + 31)) {
            System.out.println("Date: " + (value - 212) + ".08");
        } else if (value <= (243 + 30)) {
            System.out.println("Date: " + (value - 243) + ".09");
        } else if (value <= (273 + 31)) {
            System.out.println("Date: " + (value - 273) + ".10");
        } else if (value <= (304 + 30)) {
            System.out.println("Date: " + (value - 304) + ".11");
        } else if (value <= (334 + 31)) {
            System.out.println("Date: " + (value - 334) + ".12");
        }

        //2-nd method
        Integer[] monthsArray = new Integer[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Integer monthsSum = 0;
        int i = 0;

        if (value > 0) {
            while (value > monthsSum) {
                monthsSum += monthsArray[i];
                i++;
            }
            System.out.println((value - monthsSum + monthsArray[i - 1]) + "." + i);
        }
    }
}
