package baekjun.bronze;
import java.io.*;
import java.util.*;

public class B_2010_플러그 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        int sum = 0;
        for(int i =1;i<N;i++){
            arr[i] = arr[i]-1;
            sum = sum + arr[i];
        }
        System.out.println(sum + arr[0]);
    }
}
