package AD_2;

import java.util.*;

public class bfs_travel {

    int v;
    LinkedList<Integer> adj[];

    bfs_travel(int V) {
        v=V;
        adj = new LinkedList[v];
        for (int i = 0; i < adj.length; i++) {
            adj[i] = new LinkedList();
        }
    }

    public void addedge(int v, int n) {
        adj[v].add(n);
    }

    public void BFS(int s){
        boolean visted[]= new boolean[v];

        LinkedList <Integer> queue= new LinkedList<Integer>();
        visted[s]=true;
        queue.add(s);

        while (queue.size() !=0) {
            s=queue.poll();
            System.out.println(s +" ");
            Iterator<Integer> i=adj[s].listIterator();
            while(i.hasNext())
            {
                int n=i.next();
                if (!visted[n]) {
                    visted[n]=true;
                    queue.add(n);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner x= new Scanner(System.in);
        System.out.println("Enter the size of list");
        int n=x.nextInt();
        bfs_travel a=new bfs_travel(n);
        System.out.println("Enter Linked list");
        for (int i = 0; i < n; i++) {
            int v=x.nextInt();
            int e=x.nextInt();
            a.addedge(v,e);
        }
        System.out.println("Give the starting vertex");
        int g=x.nextInt();
        if (g>n) {
            System.out.println("Not enough vertex");
            System.exit(0);;
        }
        else
        a.BFS(g);
    }
}