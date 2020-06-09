package by.epamtc.firstTask;

public class Task5 {

    public static void main(String[] args) {
        int number = 258;
        int first = (number - (number % 100)) / 100;
        int second = ((number % 100) - (number % 10)) / 10;
        int third = number % 10;

        sumAndMultiplying(first, second, third);
        changeDigits(first, second, third);
        unitsLikeThousands(first, second, third);
    }

    public static void sumAndMultiplying(int first, int second, int third) {
        System.out.println("sum of digits: " + first + " + " + second + " + " + third + " = " + (first + second + third));
        System.out.println("product of multiplication of digits: " + first + " * " + second + " * " + third + " = " + (first * second * third));
    }

    public static void changeDigits(int first, int second, int third) {
        System.out.println("Result of changes :" + (second * 100 + first * 10 + third));
    }

    public static void unitsLikeThousands(int first, int second, int third) {
        System.out.println("Units like thousands: " + (third * 1000 + first * 100 + second * 10 + third));
    }
}
