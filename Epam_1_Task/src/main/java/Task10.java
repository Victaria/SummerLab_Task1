import java.util.Scanner;

public class Task10 {
    public static int previousValue;
    public static int currentValue;
    static boolean isIncreasing = true;
    static boolean hasACoupleOfSame = false;
    static boolean isAlternating = true;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        previousValue = scanner.nextInt();
        currentValue = scanner.nextInt();
        if (currentValue != 0) {
            while (currentValue != 0) {
                if (previousValue >= currentValue) {
                    isIncreasing = false;
                }
                if (previousValue == currentValue) {
                    hasACoupleOfSame = true;
                }
                if ((previousValue < 0 && currentValue < 0) || (previousValue > 0 && currentValue > 0)) {
                    isAlternating = false;
                }
                previousValue = currentValue;
                currentValue = scanner.nextInt();
            }
            System.out.println("Is Increasing - " + isIncreasing + "; Is Alternating - " + isAlternating
                    + "; has a couple of the same - " + hasACoupleOfSame);
        } else System.out.println("There is not enough numbers");
    }
}
