package by.epamtc.firstTask;

public class Task8 {

    public static void main(String[] args) {
        double a = -5;
        double b = 30;
        double h = 3;
        double x = a;
        double c = 3;
        double f = 0;

        while (x <= b) {
            if (x == 15) {
                f += (x + c) * 2;
            } else {
                f += (x - c) + 6;
            }
            x += h;
        }
        System.out.println("f(x) = " + f);
    }
}
