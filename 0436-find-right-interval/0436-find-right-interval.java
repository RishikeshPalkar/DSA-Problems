class Solution {
    public int[] findRightInterval(int[][] intervals) {
        int n = intervals.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            int end = intervals[i][1];

            int bestStart = Integer.MAX_VALUE;
            int bestIndex = -1;

            for (int j = 0; j < n; j++) {
                int start = intervals[j][0];

                if (start >= end && start < bestStart) {
                    bestStart = start;
                    bestIndex = j;
                }
            }

            ans[i] = bestIndex;
        }

        return ans;
    }
}