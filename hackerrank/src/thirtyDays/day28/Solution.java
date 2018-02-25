package thirtyDays.day28;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    private static class Person implements Comparable<Person> {
        final String name;
        final String email;
        Person(String name, String email) {
            this.name = name;
            this.email = email;
        }
        @Override
        public int compareTo(Person p) {
            return name.compareTo(p.name);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        final Pattern pattern = Pattern.compile("[a-z.]+@gmail\\.com");
        List<Person> list = new LinkedList<>();
        while (n --> 0) {
            String name = scanner.next();
            String email = scanner.next();
            Matcher matcher = pattern.matcher(email);
            if (matcher.matches())
                list.add(new Person(name, email));
        }
        scanner.close();
        Collections.sort(list);
        list.forEach(x -> System.out.println(x.name));
    }
}
