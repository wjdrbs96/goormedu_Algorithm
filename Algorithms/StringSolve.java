package goormedu_Algorithm.Algorithms;

import java.util.Scanner;

public class StringSolve {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String a = input.next();
        String b = input.next();

        if (a.compareTo(b) < 0) {
            System.out.println(-1);
        } else if (a.compareTo(b) > 0){
            System.out.println(1);
        } else{
            System.out.println(0);
        }

    }
}
