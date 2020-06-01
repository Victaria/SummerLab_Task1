public class Task9 {
    public static long result = 3;
    public static long sum = 3;

    public static void main(String[] args) {
        for (int i = 3; i <= 10; i++) {
            sum += i;
            result *= sum;
            System.out.println(result);
        }
        System.out.println(result);
    }
}
