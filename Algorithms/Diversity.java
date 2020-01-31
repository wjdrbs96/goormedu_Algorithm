package goormedu_Algorithm.Algorithms;

import java.util.*;

public class Diversity {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; ++i) {
            int k = input.nextInt();
            if (!list.contains(k)) {
                list.add(k);
            }
        }

        System.out.println(list.size());
    }
}
