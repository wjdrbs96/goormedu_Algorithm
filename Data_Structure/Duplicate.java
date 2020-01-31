package goormedu_Algorithm.Data_Structure;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.TreeSet;

public class Duplicate {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = input.nextInt();
        TreeSet<Integer> ts = new TreeSet<>();

        for (int i = 0; i < n; ++i) {
            int X = input.nextInt();

            if (ts.contains(X)) {
                writer.write("DUPLICATED\n");
            } else {
                ts.add(X);
                writer.write("OK\n");
            }
        }

        writer.flush();
        writer.close();
    }
}
