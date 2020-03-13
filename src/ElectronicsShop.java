import java.util.*;
import java.lang.*;


public class ElectronicsShop {
    public static int main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money, keyboard, usb;
        money = sc.nextInt();
        keyboard = sc.nextInt();
        usb = sc.nextInt();

        int[] keyboards = new int[keyboard];
        int[] usbs = new int[usb];
        for (int i = 0; i < keyboard; i++) {
            keyboards[i] = sc.nextInt();
        }
        for (int i = 0; i < usb; i++) {
            usbs[i] = sc.nextInt();

        }
        int sum = 0, max = Integer.MIN_VALUE,count=0;
        for (int i = 0; i < keyboard; i++) {
            for (int j = 0; j < usb; j++) {
                sum = keyboards[i] + usbs[i];
                if (sum < money) {
                    if (sum > max) {
                        max = sum;
                        count++;
                    }
                }


            }
        }
        if(count==0){
            return -1;
        }
        else
            return(max);

    }
}
