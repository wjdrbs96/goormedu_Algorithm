package goormedu_Algorithm.Data_Structure;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.TreeMap;

public class frequencyCount {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        BufferedWriter br = new BufferedWriter(new OutputStreamWriter(System.out));
        TreeMap<Integer, Integer> tm = new TreeMap<>();

        int n = input.nextInt();

        int count = 0;
        for (int i = 1; i <= n; ++i) {
            int X = input.nextInt();
            if (!tm.containsKey(X)) {  // 현재 key가 존재하지 않는다면
                tm.put(X, 1);
                count++;
                br.write(String.format("%d %d\n", count, tm.get(X)));
            } else {                   // 현재 key가 존재한다면
                tm.put(X, tm.get(X) + 1);
                br.write(String.format("%d %d\n", count, tm.get(X)));
            }

        }
        br.flush();
        br.close();

    }
}
