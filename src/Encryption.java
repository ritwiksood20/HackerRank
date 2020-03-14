import java.util.*;

public class Encryption {

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        Double a = Math.sqrt(s.length());
        int h = (int) Math.floor(a);
        int w = (int) Math.ceil(a),count=0;
        char ar[] = s.toCharArray();
        for(int i=0;i<w;i++){
            int j = i;
            while(j<s.length()){
                System.out.print(ar[j]);
                j += w;
                count++;
            }
            System.out.print(" ");
        }
    }

}
