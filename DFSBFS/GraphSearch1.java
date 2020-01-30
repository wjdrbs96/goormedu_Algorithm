package goormedu_Algorithm.DFSBFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GraphSearch1 {
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

        for (int w = 1; w <= V; ++w) {
            if (!visited[w] && adj[v][w] == 1) {
                System.out.print("-");
                DFS(w);
            }
        }
    }

    public static void BFS(int v) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(v);
        visit[v] = true;
        System.out.print(v);

        while (!q.isEmpty()) {
            v = q.poll();
            for (int w = 1; w <= V; ++w) {
                if (!visit[w] && adj[v][w] == 1) {
                    visit[w] = true;
                    System.out.print("-" + w);
                    q.offer(w);
                }
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
        BFS(1);


    }
}
