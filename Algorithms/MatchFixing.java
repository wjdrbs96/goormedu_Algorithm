package goormedu_Algorithm.Algorithms;

import java.util.Scanner;

public class MatchFixing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();   //  종이컵 수
        int K = input.nextInt();   // 고를 수
        int[] data = new int[N + 1];
        boolean isPossible = false;

        for (int i = 1; i <= N; ++i) {
            data[i] = input.nextInt();
        }

        int sum = 0;
        for (int i = 1; i <= N - K + 1; ++i) {
            sum += data[i];
            for (int j = i + 1; j < i + K; ++j) {
                sum += data[j];
            }

            if (sum % 2 == 0) {
                isPossible = true;
                break;
            }
            sum = 0;
        }

        if (isPossible) {
            System.out.println("YES");
        } else {
            System.out.println("No");
        }
    }
}
