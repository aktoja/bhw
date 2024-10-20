import java.util.Scanner;
import java.util.Arrays;

public class task3 {

    public static int[] remDup(int[] arr) {
        if (arr.length == 0) {
            return new int[0];
        }

        int[] b = new int[arr.length];
        int a = 0;
        b[a++] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                b[a++] = arr[i];
            }
        }

        return Arrays.copyOfRange(b, 0, a);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        int[] uniqueArray = remDup(arr);
        for (int i = 0; i < uniqueArray.length; i++) {
            System.out.print(uniqueArray[i] + " ");
        }
    }
}
