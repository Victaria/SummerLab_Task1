package by.epamtc.firstTask;

public class Task5 {
    public static Integer number = 258;
    public static Integer first;
    public static Integer second;
    public static Integer third;

    public static void main(String[] args) {
        first = (number - (number % 100)) / 100;
        second = ((number % 100) - (number % 10)) / 10;
        third = number % 10;

        sunAndMultiplying();
        changeDigits();
        unitsLikeThousands();
    }

    public static void sunAndMultiplying() {
        System.out.println("sum of digits: " + first + " + " + second + " + " + third + " = " + (first + second + third));
        System.out.println("product of multiplication of digits: " + first + " * " + second + " * " + third + " = " + (first * second * third));
    }

    public static void changeDigits() {
        System.out.println("Result of changes :" + (second * 100 + first * 10 + third));
    }

    public static void unitsLikeThousands() {
        System.out.println("Units like thousands: " + (third * 1000 + first * 100 + second * 10 + third));
    }
}
