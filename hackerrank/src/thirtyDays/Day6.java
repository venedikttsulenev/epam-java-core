package thirtyDays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day6 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while (t --> 0) {
            String s = reader.readLine();
            for (int i = 0; i < s.length(); i += 2)
                System.out.print(s.charAt(i));
            System.out.print(' ');
            for (int i = 1; i < s.length(); i += 2)
                System.out.print(s.charAt(i));
            System.out.print('\n');
        }
    }
}
