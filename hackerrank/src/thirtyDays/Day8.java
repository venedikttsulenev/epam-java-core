package thirtyDays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day8 {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> contacts = new HashMap<>(n);
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            contacts.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            Integer phone = contacts.get(s);
            System.out.println((null != phone) ? (s + '=' + phone) : ("Not found"));
        }
        in.close();
    }
}
