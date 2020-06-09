package by.epamtc.firstTask;

public class Task1 {
    private static int a = 2;
    private static int b = 4;
    private static int c = 8;
    private static double result = 0;

    public static void main(String[] args) {
        result = ((b + Math.pow(Math.pow(b, 2) + 4 * a * c, 0.5)) / (2 * a)) - Math.pow(a, 3) * c + Math.pow(b, -2);
        System.out.println(result);
    }
}
