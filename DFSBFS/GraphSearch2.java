package goormedu_Algorithm.DFSBFS;

import java.util.Scanner;

public class GraphSearch2 {
    public static int V;

    public static int P;
    public static int[][] adj;
    public static boolean visited[];
    public static boolean visit[];

    public static void addEdge(int v1, int v2) {
        adj[v1][v2] = 1;
        adj[v2][v1] = 1;
    }

    public static void DFS(int v) {
        visited[v] = true;

        System.out.print(v);
        for (int w = 1; w <= V; ++w) {;
            if (!visited[w] && adj[v][w] == 1) {
                System.out.print("-");
                DFS(w);
            }
        }
    }



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        V = input.nextInt(); // 정점의 수
        P = input.nextInt(); // 간선의 수
        adj = new int[V + 1][V + 1];
        visited = new boolean[V + 1];
        visit = new boolean[V + 1];

        for (int i = 0; i < P; ++i) {
            addEdge(input.nextInt(),input.nextInt());
        }

        DFS(1);
        System.out.println();
        int i = 0;

        for (i = 0; i < V - 1; ++i) {
            System.out.print(i+1 + "-");
        }

        System.out.println(i + 1);

    }
}
