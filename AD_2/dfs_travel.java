package AD_2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class dfs_travel {

    int v;
    LinkedList<Integer> adj[];
    boolean hasCycle;
    boolean visited[];

    dfs_travel(int V) {
        v = V;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i) {
            adj[i] = new LinkedList<>();
        }
        visited = new boolean[v];
    }

    public void addEdge(int v, int n) {
        adj[v].add(n);
    }

    void DFS(int s) {
        findCycle(s, s);
    }

    public void findCycle(int v, int u) {
        visited[v] = true;

        for (int w : adj[v]) {
            if (!visited[w]) {
                findCycle(w, v);
            } else if (w != u) {
                hasCycle = true;
                return;
            }
        }

        visited[v] = false; // Reset the visited flag for backtracking
    }


    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the size of list");
        int n = x.nextInt();
        dfs_travel a = new dfs_travel(n);
        System.out.println("Enter Linked list");
        for (int i = 0; i < n; i++) {
            int v = x.nextInt();
            int e = x.nextInt();
            a.addEdge(v, e);
        }
        System.out.println("Give the starting vertex");
        int g = x.nextInt();
        if (g >= n) {
            System.out.println("Not enough vertex");
            System.exit(0);
        } else {
            a.DFS(g);
            if (a.hasCycle) {
                System.out.println("Graph has a cycle");
            } else {
                System.out.println("Graph does not have a cycle");
            }
        }
    }
}
