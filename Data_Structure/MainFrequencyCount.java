package goormedu_Algorithm.Data_Structure;

import java.io.*;
import java.util.Scanner;
import java.util.TreeMap;

public class MainFrequencyCount {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter br = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = input.nextInt();

        TreeMap<Integer, Integer> frequencyMap = new TreeMap<>();

        for (int i = 0; i < N; ++i) {
            String s = bf.readLine();   // 입력을 5 4 로 받음
            int X = Integer.parseInt(s);
            

            if (!frequencyMap.containsKey(X)) {
                frequencyMap.put(X, 0);
            }

            int c = frequencyMap.size();

            int f = frequencyMap.get(X) + 1;
            frequencyMap.put(X, f);

            br.write(String.format("%d %d\n", c, f));
        }

        br.flush();
        br.close();

    }
}
