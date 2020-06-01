public class Task3 {
    private static double a = 120;
    private static double b = 12;
    private static double c = 5;

    public static void main(String[] args) {
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
