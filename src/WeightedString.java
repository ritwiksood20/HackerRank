import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class WeightedString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashSet<Integer> map=new HashSet<>();
        String s1=sc.nextLine();
        int totalqueries=sc.nextInt();
        int current=0; char curr=' ';
        for(char ch : s1.toCharArray()){
            if(ch!=curr) current = ch - 'a' + 1;
            else current+=ch-'a'+1;
            curr=ch;
            map.add(current);
        }
        for (int i=0;i<totalqueries;i++){
            int query=sc.nextInt();
            if(map.contains(query)){
                System.out.println("YES");
            }
            else
                System.out.println("NO");
        }




    }

}