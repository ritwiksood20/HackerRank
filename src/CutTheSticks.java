import java.util.*;
import java.io.*;

public class CutTheSticks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        int[] newarr = new int[size];
        int sticksleft = size;
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int curr = arr[0],count=0;
        System.out.println(size);
        for (int i = 0; i < size; i++) {
            if(curr==arr[i]){
                count++;
            }
            else{
                sticksleft-=count;
                count=1;
                curr=arr[i];
                System.out.println(sticksleft);
            }
        }

    }
}
