public class Task8 {
    public static double a = -5;
    public static double b = 30;
    public static double h = 3;
    public static double x = a;
    public static double c = 3;
    public static double f = 0;

    public static void main(String[] args) {
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
