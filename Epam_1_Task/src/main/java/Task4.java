public class Task4 {
    public static double x = 15;
    public static double f = 0;
    public static void main(String[] args) {
        if (x <= 13){
            f = 9 - Math.pow(x, 3);
        } else {
            f = -(3 / (x + 1));
        }
        System.out.println(f);
    }
}
