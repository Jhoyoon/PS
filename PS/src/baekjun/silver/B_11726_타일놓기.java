package baekjun.silver;
import java.io.*;
import java.util.*;
public class B_11726_타일놓기{
    public static void main(String[] args) throws IOException{ 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long[] D = new long[1001];
        D[1]=1;
        D[2]=2;
        for(int i=3;i<=N;i++){
            D[i] = (D[i-1]+D[i-2])%10007;
        }
        System.out.print(D[N]);
    }
}