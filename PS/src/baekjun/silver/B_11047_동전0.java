package baekjun.silver;
// import java.util.*;
// import java.io.*;
// public class B_11074_동전0 {
//     public static void main(String[] args) throws IOException{
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         StringTokenizer st = new StringTokenizer(br.readLine()," ");
//         int N = Integer.parseInt(st.nextToken());
//         int K = Integer.parseInt(st.nextToken());
//         int[] arr = new int[N];
//         for(int i=0;i<N;i++){
//             arr[i] = Integer.parseInt(br.readLine());
//         }
//         int count=0;
//         for(int i=N-1;i>=0;i--){
//             if(K==0) break;
//             if(arr[i]<=K){
//                 count = count+K/arr[i];
//                 K=K%arr[i];
//             }
//         }
//         System.out.println(count);
//     }
// }
import java.util.*;
import java.io.*;

public class B_11047_동전0{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[N];
        int max = Integer.MIN_VALUE;
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for(int i=N-1;i>=0;i--){
            if(K==0) break;
            if(arr[i]<=K){
                count = count + K/arr[i];
                K = K%arr[i];
            }
        }
        System.out.println(count);
    }
}