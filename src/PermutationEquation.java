import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PermutationEquation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Map<Integer,Integer> sequence=new HashMap<>();
        for(int i=1;i<=n;i++){
            sequence.put(sc.nextInt(),i);

        }
        System.out.println(sequence.size());
        for(int j=1;j<=sequence.size();j++){
            int x=j;
            int y=sequence.get(x);
            int z=sequence.get(y);
            System.out.println(z);
        }
    }
}
