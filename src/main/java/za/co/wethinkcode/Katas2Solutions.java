package za.co.wethinkcode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
        Set<Integer> set = new HashSet<>(arr); // handles duplicates
        int count = 0;

        for (int num : set) {
            int newCount = 0;
            int current = num;

            while (set.contains(current)) {
                newCount++;
                current += k;
            }

            count = Math.max(count, newCount);
        }
        return count;
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

    /** PROBLEM 7
     */
    public static int maxDistinctSubstringLengthInSessions(String sessionString) {
        int maxLen = 0;
        int start = 0;
        Set<Character> set = new HashSet<>();
        
        for (int end = 0; end < sessionString.length(); end++) {
            char c = sessionString.charAt(end);
            while (set.contains(c)) {
                set.remove(sessionString.charAt(start));
                start++;
            }
            set.add(c);
            maxLen = Math.max(maxLen, end - start + 1);
        }
        
        return maxLen;
}

}
