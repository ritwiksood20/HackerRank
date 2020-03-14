import java.util.*;

public class AngryProfessor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        for(int i = 0; i < testcase; i++)
        {
            int n =sc.nextInt();
            int k =sc.nextInt();
            int isontime = 0;
            for(int i1 = 0; i1 < n; i1++)
            {
                int arrivalTime = sc.nextInt();
                if(arrivalTime <= 0)
                {
                    ++isontime;
                }
            }
            if(isontime >= k)
            {
                System.out.println("NO");
            }
            else
            {
                System.out.println("YES");
            }
        }
    }
}