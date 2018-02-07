package thirtyDays;

import java.util.Scanner;

public class Day2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double meal_cost = in.nextDouble();
        int tip_percent = in.nextInt();
        int tax_percent = in.nextInt();
        in.close();
        int resulting_cost = (int)Math.round(meal_cost*(1 + 0.01*(tip_percent + tax_percent)));
        System.out.format("The total meal cost is %d dollars.", resulting_cost);
    }
}
