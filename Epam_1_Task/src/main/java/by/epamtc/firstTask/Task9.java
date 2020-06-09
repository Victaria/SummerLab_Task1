package by.epamtc.firstTask;

public class Task9 {

    public static void main(String[] args) {
        long result = 3;
        long sum = 3;

        for (int i = 3; i <= 10; i++) {
            sum += i;
            result *= sum;
            System.out.println(result);
        }
        System.out.println(result);
    }
}
