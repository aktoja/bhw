import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();

        String res = "";
        char c = a.charAt(0);
        int count = 1;

        for (int i = 1; i < a.length(); i++) {
            if (a.charAt(i) == c) {
                count++;
            } else {
                res += c + String.valueOf(count);
                c = a.charAt(i);
                count = 1;
            }
        }

        res += c + String.valueOf(count);

        System.out.println(res);
    }
}
