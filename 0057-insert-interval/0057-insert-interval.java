class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<int[]> al = new ArrayList<>();
        int i = 0;
        int n = intervals.length;
        
        while (i<n && intervals[i][1] < newInterval[0]){
            al.add(new int[]{intervals[i][0], intervals[i][1]});
            i = i + 1;
        }

        while (i<n && intervals[i][0] <= newInterval[1]){
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        al.add(new int[]{newInterval[0], newInterval[1]});

        while (i<n){
            al.add(new int[]{intervals[i][0], intervals[i][1]});
            i++;
        }

        int[][] arr = new int[al.size()][2];

        for (int j = 0; j<al.size(); j++){
            arr[j][0] = al.get(j)[0];
            arr[j][1] = al.get(j)[1];
        }

        return arr;

    }
}