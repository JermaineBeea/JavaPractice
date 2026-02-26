package za.co.wethinkcode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Katas2Solutions {

    // Problem 1
    public static List<List<Integer>> mergeIntervals(List<List<Integer>> intervals) {
        intervals.sort(Comparator.comparingInt(a -> a.get(0))); // sort by start time

        ArrayList<List<Integer>> result = new ArrayList<>();
        result.add(intervals.get(0));

        for (int n = 1; n < intervals.size(); n++) {
            List<Integer> current = intervals.get(n);
            List<Integer> last = result.getLast();

            if (current.get(0) <= last.get(1)) {
                result.removeLast();
                result.add(List.of(last.get(0), Math.max(last.get(1), current.get(1))));
            } else {
                result.add(current);
            }
        }
        return result;
    }
    
    
    // Problem 2
    public static List<List<Integer>> sortByIndex(int indx, List<List<Integer>> nested)  {
        // Option 1
        nested.sort(Comparator.comparingInt(list -> list.get(indx)));

        // Option 2
        nested.sort((a, b) -> Integer.compare(a.get(indx), b.get(indx)));

        return nested;
    }
    

    /** PROBLEM 3
     */
    public static int findLongestArithmeticProgression(List<Integer> arr, int k) {
        // TODO: Implement this method
        return 0;
    }

    /** PROBLEM 4
     */
    public static int findLongestConsecutiveAbsoluteDifference(int diff, List<Integer> arr) {
        // TODO: Implement this method
        return 0;
    }

    /** PROBLEM 5
     */
    public static int manualIndexDetermination(List<Integer> nums, int target) {
        // TODO: Implement this method
        return -1;
    }

    /** PROBLEM 6
     */
    public static int findPeakIndex(List<Integer> counts) {
        // TODO: Implement this method
        return 0;
    }
}
