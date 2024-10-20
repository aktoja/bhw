import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );
        int c = 0;
        int n = scan.nextInt();
        while (n != 0) {
            c += n % 10;
            n /= 10;
            if (n > 0){
                c *= 10;
            }
        }
        System.out.print(c);
    }
}