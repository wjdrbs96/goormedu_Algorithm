package goormedu_Algorithm.Data_Structure;

import java.util.Scanner;

class ArrayUtil {
    public static int[] MergeTwoArray(int[] A, int N, int[] B, int M) {
        int[] C = new int[N + M];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < N && j < M) {
            if (A[i] < B[j]) {
                C[k++] = A[i++];
            } else {
                C[k++] = B[j++];
            }
        }

        while (i < N ) {
            C[k++] = A[i++];
        }

        while (j < M) {
            C[k++] = B[j++];
        }

        return C;
    }
}



public class Main_ArraySum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int M = input.nextInt();

        int[] A = new int[N];
        int[] B = new int[M];

        for (int i = 0; i < N; ++i) {
            A[i] = input.nextInt();
        }

        for (int j = 0; j < M; ++j) {
            B[j] = input.nextInt();
        }

        int[] MergedArray = ArrayUtil.MergeTwoArray(A, N, B, M);

        for (int k : MergedArray) {
            System.out.print(k + " ");
        }

    }
}
