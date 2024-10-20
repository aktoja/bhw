import java.util.Scanner;

public class task8 {
    public static void hanoi(int n, char from, char to, char aux) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + from + " to " + to);
        } else {
            hanoi(n - 1, from, aux, to);
            System.out.println("Move disk " + n + " from " + from + " to " + to);
            hanoi(n - 1, aux, to, from);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        hanoi(n, 'A', 'C', 'B');
    }
}
