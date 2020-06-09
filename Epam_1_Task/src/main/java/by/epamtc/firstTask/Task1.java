package by.epamtc.firstTask;

public class Task1 {

    public static void main(String[] args) {
        int a = 2;
        int b = 4;
        int c = 8;

        double result = 0;

        result = ((b + Math.pow(Math.pow(b, 2) + 4 * a * c, 0.5)) / (2 * a)) - Math.pow(a, 3) * c + Math.pow(b, -2);
        System.out.println(result);
    }
}
