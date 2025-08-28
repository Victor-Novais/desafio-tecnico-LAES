import java.util.Arrays;

public class MergeIntervals {
    public static int[][] mergeIntervals(int[][] intervals){
        int[][] newIntervals = new int[intervals.length][intervals[0].length];

        for (int i = 0, j = 1; i < intervals.length; i++, j++) {
            if (j == intervals.length) j--;
            if (intervals[i][1] >= intervals[j][0]) {
                newIntervals[i][0] = intervals[i][0];
                newIntervals[i][1] = intervals[j][1];
                i++;
                j++;
            } else {
                newIntervals[i][0] = intervals[i][0];
                newIntervals[i][1] = intervals[i][1];
            }
        }

        return Arrays.stream(newIntervals)
                .filter(interval -> interval[0] != 0 && interval[1] != 0)
                .toArray(int[][]::new);
    }
}
