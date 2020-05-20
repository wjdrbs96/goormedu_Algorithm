package goormedu_Algorithm.DFSBFS;

import java.util.*;

public class Tomato {
    static int N;
    static int M;
    static int[][] adj;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0 , 0, 1, -1};

    public static void bfs() {
        Queue<Toma> queue = new LinkedList<>();
        Set<Integer> set = new HashSet<>();

        for (int i = 1; i <= N; ++i) {
            for (int j = 1; j <= M; ++j) {
                if (adj[i][j] == 1) {
                    queue.offer(new Toma(i, j));
                }
            }
        }

        while (!queue.isEmpty()) {
            Toma t = queue.poll();

            for (int i = 0 ; i < 4; ++i) {
                int nx = t.x + dx[i];
                int ny = t.y + dy[i];

                if (nx >= 1 && nx <= N && ny >= 1 && ny <= M && adj[nx][ny] == 0) {
                    queue.offer(new Toma(nx, ny));
                    adj[nx][ny] = adj[t.x][t.y] + 1;
                }
            }
        }

        if (check()) {
            for (int i = 1; i <= N; ++i) {
                for (int j = 1; j <= M; ++j) {
                    set.add(adj[i][j]);
                }
            }

            System.out.println(Collections.max(set) - 1);
        }
        else {
            System.out.println(-1);
        }
    }

    public static boolean check() {
        for (int i = 1; i <= N; ++i) {
            for (int j = 1; j <= M; ++j) {
                if (adj[i][j] == 0) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        M = input.nextInt();
        N = input.nextInt();

        adj = new int[N + 1][M + 1];

        for (int i = 1; i <= N; ++i) {
            for (int j = 1; j <= M; ++j) {
                adj[i][j] = input.nextInt();
            }
        }

        bfs();

    }
}

class Toma {
    int x;
    int y;

    public Toma(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
