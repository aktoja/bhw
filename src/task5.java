import java.util.Scanner;

public class task5 {

    public static String day(int day, int month, int year) {
        int[] t = {0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4};
        if (month < 3) {
            year--;
        }

        int dayOfWeek = (year + year / 4 - year / 100 + year / 400 + t[month - 1] + day) % 7;

        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        return days[dayOfWeek];
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String date = scan.nextLine();

        String[] parts = date.split(" ");
        int day = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int year = Integer.parseInt(parts[2]);

        System.out.println(day(day, month, year));
    }
}
