package questao08;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public int[][] merge(int[][] intervals) {

        int[][] newIntervals = new int[intervals.length][2];
        for (int i = 0; i < intervals.length-1; i++) {
            Arrays.sort(intervals[i]);
            if (intervals[i+1][0]<=intervals[i][1]){
                newIntervals[i] = new int[]{intervals[i][0], intervals[i + 1][1]};
                //newIntervals[i+1] = new int[]{intervals[i+1][0], intervals[i+1][1]};
                i++;
            } else {
                newIntervals[i] = new int[]{intervals[i][0], intervals[i][1]};
            }
        }
        newIntervals[intervals.length-1] = new int[]{intervals[intervals.length-1][0], intervals[intervals.length-1][1]};
        return newIntervals;
    }
}
