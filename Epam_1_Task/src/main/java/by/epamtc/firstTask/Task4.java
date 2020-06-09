package by.epamtc.firstTask;

public class Task4 {

    public static void main(String[] args) {
        double x = 15;
        double f = 0;

        if (x <= 13) {
            f = 9 - Math.pow(x, 3);
        } else {
            f = -(3 / (x + 1));
        }
        System.out.println(f);
    }
}
