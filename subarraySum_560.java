class subarraySum_560 {
  //Brute Force Approach T. C- O(N^3)
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        for(int i = 0; i < n; i ++){
            for(int j = i; j < n; j ++){
                int sum = 0;
                for(int l = i; l <= j; l ++){
                    sum += nums[l];
                }
                if(sum == k){
                    count ++;
                }
            }
        }
        return count;
    }
  // Better Approach Amputated one for loop l
    public int subarraySum1(int[] nums, int k) {
          int n = nums.length;
          int count = 0;
          for(int i = 0; i < n; i ++){
              int sum =0;
              for(int j = i; j < n; j ++){
                  sum += nums[j];
                  if(sum == k){
                      count ++;
                  }
              }
          }
          return count;
      }
  //Optimal Approach - Prefix sum
    public int subarraySum2(int[] nums, int k) {
        int n = nums.length;
        Map<Integer, Integer> mpp = new HashMap<>();
        int preSum = 0, count = 0;
        mpp.put(0,1);
        for(int  i = 0; i < n; i ++){
            preSum += nums[i];
            int remove = preSum - k;
            count += mpp.getOrDefault(remove, 0);
            mpp.put(preSum, mpp.getOrDefault(preSum, 0 ) + 1);
        }
        return count;
    }
}
