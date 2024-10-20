import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[] number = Long.toString(scan.nextLong()).toCharArray();
        System.out.println(number);

        for(int i = 0; i < number.length; i++) {
            for(int j = i + 1; j < number.length; j++) {
                if (number[i] != number[j]) {
                    char ni = number[i];
                    char nj = number[j];

                    number[i] = nj;
                    number[j] = ni;

                    System.out.println(number);

                    number[i] = ni;
                    number[j] = nj;
                }
            }
        }
    }
}
