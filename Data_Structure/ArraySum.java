package goormedu_Algorithm.Data_Structure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        int a = input.nextInt();
        int b = input.nextInt();

        for (int i = 0; i < a + b; ++i) {
            list.add(input.nextInt());
        }

        Collections.sort(list);

        for (int k : list) {
            System.out.print(k + " ");
        }
    }
}
