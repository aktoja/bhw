import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String pattern = scanner.nextLine();
        List<Integer> indices = kmpSearch(text, pattern);
        if (indices.isEmpty()) {
            System.out.println("-1");
        } else {
            for (int index : indices) {
                System.out.print(index + " ");
            }
        }
    }

    private static List<Integer> kmpSearch(String text, String pattern) {
        int[] lps = computeLPSArray(pattern);
        List<Integer> indices = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < text.length()) {
            if (pattern.charAt(j) == text.charAt(i)) {
                i++;
                j++;
            }
            if (j == pattern.length()) {
                indices.add(i - j);
                j = lps[j - 1];
            } else if (i < text.length() && pattern.charAt(j) != text.charAt(i)) {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }
        return indices;
    }

    private static int[] computeLPSArray(String pattern) {
        int[] lps = new int[pattern.length()];
        int length = 0;
        lps[0] = 0;
        for (int i = 1; i < pattern.length(); i++) {
            while (length > 0 && pattern.charAt(i) != pattern.charAt(length)) {
                length = lps[length - 1];
            }
            if (pattern.charAt(i) == pattern.charAt(length)) {
                length++;
                lps[i] = length;
            } else {
                lps[i] = 0;
            }
        }
        return lps;
    }
}
