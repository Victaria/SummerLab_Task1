import java.time.Year;

public class Task2 {
    public static int value = 220;

    public static void main(String[] args) {
        //1-st method
        Year.of(2018).atDay(200);
        System.out.println(Year.of(2018).atDay(value).getDayOfMonth() + " " + Year.of(2018).atDay(value).getMonth());

        //2-nd method
        Integer[] monthsArray = new Integer[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Integer monthsSum = 0;
        int i = 0;

        if (value > 0) {
            while (value > monthsSum) {
                monthsSum += monthsArray[i];
                i++;
            }
            System.out.println((value - monthsSum + monthsArray[i - 1]) + "." + i);
        }
    }
}
