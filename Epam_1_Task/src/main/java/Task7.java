public class Task7 {
    public static final double R = 868.652;

    public static void main(String[] args) {
        double result = Math.round((R % 1) * 1000) + (int) R * 0.001;
        System.out.println(result);
    }
}
