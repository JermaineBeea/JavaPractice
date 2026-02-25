package za.co.wethinkcode;

import java.util.ArrayList;
import java.util.List;

public class Katas_2 {

    /** PROBLEM 1
     * Merge all overlapping intervals in a list of integer pairs.
     * Given a list of intervals where each interval is [start, end],
     * return a new list with all overlapping intervals merged.
     * For example, given [[1,3],[2,6],[8,10],[15,18]],
     * return [[1,6],[8,10],[15,18]] because [1,3] and [2,6] overlap and merge into [1,6].
     * Note: Two intervals overlap if the start of one is less than or equal
     * to the end of the other. For example, [1,3] and [2,6] overlap (2 <= 3),
     * but [1,3] and [4,6] do not (4 > 3).
     * Note: The intervals may not be sorted. Sort by start time before merging.
     * For example, given [[2,6],[1,3],[8,10],[15,18]],
     * return [[1,6],[8,10],[15,18]].
     * Constraints: Each interval will have exactly 2 elements [start, end].
     * All integers will be 32-bit signed integers.
     * start will always be less than or equal to end within a single interval.
     */
    public static List<List<Integer>> mergeIntervals(List<List<Integer>> intervals) {
        // TODO: Implement this method
        return null;
    }
        
    /** PROBLEM 2
     * Sort a nested list of integer arrays by a specified index.
     * Given a list of integer arrays and an index, return the list sorted
     * in ascending order based on the element at the given index.
     * For example, given [[3, 1], [1, 2], [2, 3]] and index 0,
     * return [[1, 2], [2, 3], [3, 1]].
     * Note: If any array in the list does not contain the specified index,
     * throw an exception indicating the array is too small.
     * For example, given [[1, 2], [3]] and index 1, throw an Exception.
     * Constraints: The index will be a non-negative integer.
     * All integers in the arrays will be 32-bit signed integers.
     */
    static List<List<Integer>> sortByIndex(int indx, List<List<Integer>> variables) throws Exception {
        // TODO: Implement this method
        return null;
    }


}
