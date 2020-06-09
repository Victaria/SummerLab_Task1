package by.epamtc.firstTask;

public class Task3 {

    public static void main(String[] args) {
        double a = 120;
        double b = 12;
        double c = 5;

        if ((a > b) && (b > c)) {
            a *= 2;
            b *= 2;
            c *= 2;
        } else {
            a = Math.abs(a);
            b = Math.abs(b);
            c = Math.abs(c);
        }
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
    }
}
