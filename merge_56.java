class merge_56 {
    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0) return new int[0][0];

        // Step 1: Sort intervals by their start time
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        // Step 2: Use a list to store the merged intervals
        List<int[]> merged = new ArrayList<>();

        // Step 3: Traverse through the sorted intervals
        int start = intervals[0][0];
        int end = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            // If the current interval overlaps with the previous one, merge them
            if (intervals[i][0] <= end) {
                end = Math.max(end, intervals[i][1]);
            } else {
                // Add the merged interval to the result
                merged.add(new int[]{start, end});
                // Update start and end for the next interval
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }

        // Add the last interval
        merged.add(new int[]{start, end});

        // Convert the result list back to an array
        return merged.toArray(new int[merged.size()][]);
    }
}
