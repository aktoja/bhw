import java.util.Scanner;
import java.util.Arrays;

public class task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );
        String c = (scan.nextLine()).toLowerCase();
        String n = (scan.nextLine()).toLowerCase();
        char[] g = n.toCharArray();
        char[] h = c.toCharArray();
        Arrays.sort(g);
        Arrays.sort(h);

        if (Arrays.equals(g,h)) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}