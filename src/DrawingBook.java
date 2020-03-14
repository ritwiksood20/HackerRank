import java.util.*;

public class DrawingBook {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int beginning = (p/2);
        int ending = 0;
        if(n%2==1)
            ending = (n-p)/2;
        else
            ending = (int) Math.ceil((n-p)/2.0);
        System.out.println(Math.min(beginning, ending));
    }
}
