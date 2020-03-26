import java.util.Scanner;

public class AlternatingCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0) {
            char[] characters= sc.next().toCharArray();
            int count =0;
            for(int i1=0;i1<characters.length-1;i1++) {
                if(characters[i1]==characters[i1+1]) {
                    count++;
                }

            }
            T--;

            System.out.println(count);
        }

    }
}
