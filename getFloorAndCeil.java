class getFloorAndCeil {
    public int[] getFloorAndCeil(int x, int[] arr) {
        // code here
        int floor = -1; // Initialize floor to -1
        int ceil = -1;  // Initialize ceil to -1

        for (int num : arr) {
            if (num <= x) {
                // Update floor if the current number is larger
                floor = Math.max(floor, num);
            }
            if (num >= x) {
                // Update ceil if the current number is smaller
                if (ceil == -1 || num < ceil) {
                    ceil = num;
                }
            }
        }

        return new int[]{floor, ceil}; // Return the floor and ceil
    }
}
