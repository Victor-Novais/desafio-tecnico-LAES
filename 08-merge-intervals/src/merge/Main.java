package merge;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<int[]> mergedIntervals = Merge.mergeOverlap(new int[][] {{1,2}, {3,4}, {1, 8}});
		for (int[] interval : mergedIntervals) {
            System.out.println(Arrays.toString(interval));
        }
	}

}
