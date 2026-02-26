package za.co.wethinkcode;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class TestKatas2SolutionsSolutions {

    @Test
    public void testMergeIntervals() throws Exception {
        assertEquals(Arrays.asList(Arrays.asList(1, 6), Arrays.asList(8, 10), Arrays.asList(15, 18)),
                Katas2Solutions.mergeIntervals(Arrays.asList(Arrays.asList(1, 3), Arrays.asList(2, 6), Arrays.asList(8, 10), Arrays.asList(15, 18))));
        assertEquals(Arrays.asList(Arrays.asList(1, 6), Arrays.asList(8, 10), Arrays.asList(15, 18)),
                Katas2Solutions.mergeIntervals(Arrays.asList(Arrays.asList(2, 6), Arrays.asList(1, 3), Arrays.asList(8, 10), Arrays.asList(15, 18))));
        assertEquals(Arrays.asList(Arrays.asList(1, 6)),
                Katas2Solutions.mergeIntervals(Arrays.asList(Arrays.asList(1, 4), Arrays.asList(2, 5), Arrays.asList(3, 6))));
        assertEquals(Arrays.asList(Arrays.asList(1, 5)),
                Katas2Solutions.mergeIntervals(Arrays.asList(Arrays.asList(1, 3), Arrays.asList(3, 5))));
    }

    @Test
    public void testSortByIndex() throws Exception {
        assertEquals(Arrays.asList(Arrays.asList(1, 2), Arrays.asList(2, 3), Arrays.asList(3, 1)),
                Katas2Solutions.sortByIndex(0, Arrays.asList(Arrays.asList(3, 1), Arrays.asList(1, 2), Arrays.asList(2, 3))));
        assertEquals(Arrays.asList(Arrays.asList(3, 1), Arrays.asList(1, 2), Arrays.asList(2, 3)),
                Katas2Solutions.sortByIndex(1, Arrays.asList(Arrays.asList(3, 1), Arrays.asList(1, 2), Arrays.asList(2, 3))));
        assertThrows(Exception.class, () -> Katas2Solutions.sortByIndex(1, Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3))));
    }

    @Test
    public void testFindLongestArithmeticProgression() {
        assertEquals(6, Katas2Solutions.findLongestArithmeticProgression(Arrays.asList(8, 1, -1, 0, 3, 6, 2, 4, 5, 7, 9), 2));
        assertEquals(5, Katas2Solutions.findLongestArithmeticProgression(Arrays.asList(1, 2, 3, 4, 5), -1));
        assertEquals(1, Katas2Solutions.findLongestArithmeticProgression(Arrays.asList(1, 3, 7), 2));
        assertEquals(1, Katas2Solutions.findLongestArithmeticProgression(Arrays.asList(1, 1, 1), 0));
    }

    @Test
    public void testFindLongestConsecutiveAbsoluteDifference() {
        assertEquals(5, Katas2Solutions.findLongestConsecutiveAbsoluteDifference(1, Arrays.asList(1, 5, 3, 4, 2)));
        assertEquals(4, Katas2Solutions.findLongestConsecutiveAbsoluteDifference(2, Arrays.asList(1, 3, 5, 7, 2, 4, 6)));
        assertEquals(1, Katas2Solutions.findLongestConsecutiveAbsoluteDifference(3, Arrays.asList(1, 10, 20)));
        assertEquals(1, Katas2Solutions.findLongestConsecutiveAbsoluteDifference(0, Arrays.asList(3, 3, 3)));
    }

    @Test
    public void testManualIndexDetermination() {
        assertEquals(2, Katas2Solutions.manualIndexDetermination(Arrays.asList(4, 2, 7, 1), 7));
        assertEquals(-1, Katas2Solutions.manualIndexDetermination(Arrays.asList(4, 2, 7, 1), 5));
        assertEquals(0, Katas2Solutions.manualIndexDetermination(Arrays.asList(9, 3, 5), 9));
        assertEquals(3, Katas2Solutions.manualIndexDetermination(Arrays.asList(1, 2, 3, 42), 42));
        assertEquals(-1, Katas2Solutions.manualIndexDetermination(Arrays.asList(), 1));
    }

    @Test
    public void testFindPeakIndex() {
        assertEquals(2, Katas2Solutions.findPeakIndex(Arrays.asList(1, 3, 5, 4, 2)));
        assertEquals(1, Katas2Solutions.findPeakIndex(Arrays.asList(1, 5, 4, 3, 2)));
        assertEquals(4, Katas2Solutions.findPeakIndex(Arrays.asList(1, 2, 3, 4, 5, 4)));
        assertEquals(5, Katas2Solutions.findPeakIndex(Arrays.asList(0, 2, 4, 6, 8, 10, 9, 7, 5, 3, 1)));
    }

    @Test
    public void testMaxDistinctSubstringLengthInSessions() {
        assertEquals(3, Katas2Solutions.maxDistinctSubstringLengthInSessions("abcabcbb"));
        assertEquals(5, Katas2Solutions.maxDistinctSubstringLengthInSessions("abcde"));
        assertEquals(1, Katas2Solutions.maxDistinctSubstringLengthInSessions("aaaaa"));
        assertEquals(0, Katas2Solutions.maxDistinctSubstringLengthInSessions(""));
        assertEquals(1, Katas2Solutions.maxDistinctSubstringLengthInSessions("x"));
        assertEquals(11, Katas2Solutions.maxDistinctSubstringLengthInSessions("abcdeafghijk"));
    }

    @Test
    public void testFindNthFibonacci(){
        // 1 2 3 5 8 13 21 34
        assertEquals(34, Katas2Solutions.findNthFibonacci(7));
        assertEquals(8, Katas2Solutions.findNthFibonacci(4));
    }
}