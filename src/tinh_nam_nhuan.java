import java.util.Scanner;

public class tinh_nam_nhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("Enter a Year");
        year = scanner.nextInt();
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("is a leap year");
        }  else if (year % 100 == 0 && year % 400 == 0)
        {
            System.out.println("is a leap year");
        } else
        {
            System.out.println("is not a leap year");
        }
    }
}
