import java.util.*;
import java.io.*;

public class Tourmap{
    public static void main(String[] args) throws IOException {
        final BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        final StringBuilder stringbuilder=new StringBuilder();
        for(int t=Integer.parseInt(br.readLine());t>0;t--){
            final int n=Integer.parseInt(br.readLine());
            long sum=0;
            final Map<String,String> map=new HashMap<>();
            for(int i=0;i<n-1;i++){
                final String split[]=br.readLine().split("");
                sum+=Integer.parseInt(split[2].substring(0,split[2].length()-1));
                map.put(split[0],split[1]);

            }
            String start="";
            for(String key:map.keySet()){
                if(!map.containsValue(key)){
                    start=key;
                    break;
                }
            }
            for(int i=0;i<n-1;i++){
                String value=map.get(start);
                stringbuilder.append(start).append(' ').append(value).append('\n');
                start=map.get(start);

            }
            stringbuilder.append(sum).append('\n');

        }
        System.out.println(stringbuilder);
    }
}