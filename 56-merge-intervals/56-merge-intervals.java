import java.util.*;
import java.io.*;

class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[0], i2[0]));
        ArrayList<int[]> a = new ArrayList<>();
        int[] newint = intervals[0];
        a.add(newint);
        int n = intervals.length;
        for(int i=1; i<n; i++){
            if(intervals[i][0]<=newint[1]){
                newint[1] = Math.max(intervals[i][1], newint[1]);
            }
            else{
                newint = intervals[i];
                a.add(newint);
            }
        }
        return a.toArray(new int[a.size()][]);
    }
}