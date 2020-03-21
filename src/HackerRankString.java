import java.util.Scanner;

public class HackerRankString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int queries = scan.nextInt();
        for(int i=0;i<queries;i++) {
            String s1 = scan.next();
            System.out.println(issubsequenceExists(s1) ? "YES" : "NO");
        }
        scan.close();
    }

    private static boolean issubsequenceExists(String s1) {
        String s2 = "hackerrank";
        int index = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == s2.charAt(index)) {
                index++;
            }
            if (index == s2.length()) {
                return true;
            }
        }
        return false;
    }
}