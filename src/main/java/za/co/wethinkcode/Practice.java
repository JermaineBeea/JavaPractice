package za.co.wethinkcode;

import java.util.List;
import java.util.ArrayList;

public class Practice{

    /** PROBLEM 8
     */
    public static int calculateMinimumTimeUnits(List<Integer> tasks, int m, int k) {
        // TODO: Implement this method
        return 0;
    }

    public static void main(String[] args)throws Exception {
        List<Integer> tasks = List.of(1, 1, 1, 2, 2, 3);
        int machines = 3;
        int coolDown = 2;

        int result = calculateMinimumTimeUnits(tasks, machines, coolDown);
        System.out.println("Result: " + result);
    }
}