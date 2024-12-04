class MaxSubArray {
  //Kadanes Algorithm T.C - O(N), S.C - O(1)
    public int maxSubArray(int[] nums) {
        int sum = 0, max = Integer.MIN_VALUE;
        for(int num : nums){
            sum += num;
            max = Integer.max(max,sum);
            if(sum < 0){
                sum = 0;
            }
        }
        return max;
    }
}
