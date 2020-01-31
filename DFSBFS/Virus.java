package goormedu_Algorithm.DFSBFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Virus {
    int numberOfVirus;
    int depth;
    static int MAXIMUM_VIRUS = 10000;

    public Virus(int numberOfVirus, int depth) {
        this.numberOfVirus = numberOfVirus;
        this.depth = depth;
    }

    public static void testCase(int targetNumber) {
        int[] distance = new int[MAXIMUM_VIRUS + 1];             // 시간초를 재기 위함
        boolean[] visited = new boolean[MAXIMUM_VIRUS + 1];      // 방문 체크

        Virus Init = new Virus(1,1);
        Queue<Virus> queue = new LinkedList<>();
        queue.add(Init);

        while(!queue.isEmpty()) {
            Virus current = queue.poll();

            if (current.numberOfVirus > MAXIMUM_VIRUS) {           // 바이러스 수가 10만 보다 크면 continue;
                continue;
            } else if (visited[current.numberOfVirus]) {           // 이미 방문한 곳인지 체크
                continue;
            }

            visited[current.numberOfVirus] = true;
            distance[current.numberOfVirus] = current.depth - 1;  // 바이러스 1이 0초 걸리므로 -1 하기

            Virus nextIncrease = new Virus(current.numberOfVirus * 2, current.depth + 1);
            Virus nextDecrease = new Virus(current.numberOfVirus / 3, current.depth + 1);

            queue.add(nextIncrease);
            queue.add(nextDecrease);
        }

        int result = distance[targetNumber];
        System.out.println(result);

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i = 1; i <= n; ++i) {
            testCase(input.nextInt());
        }

    }
}
