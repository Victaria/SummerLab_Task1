package by.epamtc.firstTask;

public class Task7 {

    public static void main(String[] args) {
        double R = 868.652;

        double result = Math.round((R % 1) * 1000) + (int) R * 0.001;
        System.out.println(result);
    }
}
