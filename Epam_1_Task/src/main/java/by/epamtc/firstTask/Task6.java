package by.epamtc.firstTask;

public class Task6 {

    public static void main(String[] args) {
        int sum = 0;
        long bigSum = 0;

        int d = 120;
        int a1 = 800;

        // for int
        int n = 5976; // 5977 - out of int
        sum = (2 * a1 + d * (n - 1)) / 2 * n;
        System.out.println(sum);

        //for long
        long longN = 876706521; // 876706522 - out of long
        bigSum = (2 * a1 + d * (longN - 1)) / 2 * longN;
        System.out.println(bigSum);
    }
}
