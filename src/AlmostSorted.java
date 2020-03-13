import java.io.*;

public class AlmostSorted{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int N = Integer.parseInt(br.readLine());
        final int[] arr = new int[N];
        String[] line = br.readLine().split(" ");
        for(int i = 0; i < N; ++i){
            arr[i] = Integer.parseInt(line[i]);
        }
        System.out.print(solve(arr, N));
    }

    private static String solve(final int[] A, final int N){
        int left = 0;
        int right = N - 1;
        while(left < right && A[left] <= A[left +1]){
            ++left;
        }
        if(left == right){
            return "yes";
        }
        while(right > left && A[right] >= A[right -1]){
            --right;
        }
        if((left > 0 && A[right] < A[left -1]) || (right < N-1 && A[left] > A[right +1])){
            return "no";
        }
        int m;
        for(m = left +1; m < right && A[m] >= A[m+1]; ++m){}
        if(m == right){
            return "yes\n" + ((right - left < 2) ? "swap " : "reverse ") + (left +1) + " " + (right +1);
        }
        if(m- left > 1 || A[left] < A[right -1] || A[right] > A[left +1]){
            return "no";
        }
        for(int k = right -1; m < k && A[m] <= A[m+1]; ++m){}
        return (right -m > 1) ? "no" : "yes\nswap " + (left +1) + " " + (right +1);
    }
}

