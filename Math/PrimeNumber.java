package goormedu_Algorithm.Math;

import java.util.Scanner;

public class PrimeNumber {
    public static int isPrime(int p, int a, int b) {
        int count = 0;
        System.out.println("Case #" + p + ":");
        for (int i = a; i <= b; ++i) {
            if (PrimeCheck(i)) {
                count++;
            }
        }
        return count;
    }

    public static boolean PrimeCheck(int a) {
        if (a == 1) {
            return false;
        }

        int n = (int)Math.floor(Math.sqrt(a));

        for (int k = 2; k < n + 1; ++k) {
            if (a % k == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for (int i = 1; i <= n; ++i) {
            System.out.println(isPrime(i, input.nextInt(), input.nextInt()));

        }
    }
}
