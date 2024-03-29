package baekjun.gold;
import java.io.*;
import java.util.*;
public class B_1753_최단경로{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int node = Integer.parseInt(st.nextToken());
        int edge = Integer.parseInt(st.nextToken());
        int start =Integer.parseInt(br.readLine());
        ArrayList<Node>[] arr = new ArrayList[node+1];
        for(int i=1;i<=node;i++){
            arr[i] = new ArrayList<>();
        }
        int[] distance = new int[node+1];
        Arrays.fill(distance,Integer.MAX_VALUE);
        distance[start] = 0;
        for(int i=1;i<=edge;i++){
            st = new StringTokenizer(br.readLine()," ");
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int value = Integer.parseInt(st.nextToken());
            arr[s].add(new Node(e,value));
        }
        PriorityQueue<Node> q = new PriorityQueue<>((o1,o2)->{
            return o1.value - o2.value;
        });
        q.add(new Node(start,0));
        boolean[] visited = new boolean[node+1];
        while(!q.isEmpty()){
            Node now = q.poll();
            if(visited[now.node]) continue;
            visited[now.node] = true;
            for(Node i : arr[now.node]){
                    distance[i.node] = Math.min(distance[i.node],now.value+i.value);
                    q.add(new Node(i.node,distance[i.node]));
            }
        }
        StringBuffer sb = new StringBuffer();
        for(int i=1;i<=node;i++){
            if(visited[i]) sb.append(distance[i]+"\n");
            else sb.append("INF\n");
        }
        System.out.print(sb.toString());

        

    }
    static class Node{
        int node;
        int value;
        Node(int node,int value){
            this.node = node;
            this.value = value;
        }
    }
}