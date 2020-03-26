import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GameOfThrones {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int odd=0,even=0;
        String line=sc.nextLine();
        Map<Character, Integer> map=new HashMap<>();
        for(char c: line.toCharArray()){
            if(map.containsKey(c))
                map.put(c,map.get(c)+1);
            else
                map.put(c,1);
        }
        for(Integer i:map.values()){
            if(i%2==1){
                odd++;
                continue;
            }
            else if(i%2==0){
                even++;


            }
        }
        if(odd>1)
            System.out.println("NO");
        else
            System.out.println("YES");


    }
}
