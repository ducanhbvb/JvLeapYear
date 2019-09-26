import java.util.Scanner;

public class LeapYear {
    public static void main(String[] avg) {
        Scanner sc = new Scanner(System.in);
        int year = 1;
        while (year != 0) {
            System.out.println("Enter a year: ");
            year = sc.nextInt();
            boolean isLeapYear = false;

            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        isLeapYear = true;
                    }
                } else {
                    isLeapYear = true;
                }
            }

            if (isLeapYear) {
                System.out.printf("%d is a leap year", year);
            } else {
                System.out.printf("%d is NOT a leap year", year);
            }
        }
    }

}