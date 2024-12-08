class Leaders {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> nums = new ArrayList<>();
        int n = arr.length;
        int maxFromRight = arr[n - 1];
        nums.add(maxFromRight);
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= maxFromRight) {
                maxFromRight = arr[i];
                nums.add(maxFromRight);
            }
        }
        Collections.reverse(nums);
        return nums;
    }
}
