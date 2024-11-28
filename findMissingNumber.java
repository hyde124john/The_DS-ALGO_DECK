class findMissingNumber {
  
  // BRUTE-FORCE APPROACH T. C = O(N * M), S. C = O(1);
    public int missingNumber(int[] nums) {
        for(int i = 1; i <= nums.length; i ++){
            int flag = 0;
            for(int j = 0; j < nums.length; j ++){
                if(nums[j] == i){
                    flag = 1;
                    break;
                }
            }
            if(flag == 0){
                return i;
            }
        }
        return 0;
    }
  
  //Better Approach T. C = O(N), S. C = O(N)
    public int missingNumber1(int[] nums) {
        int N = nums.length;
        int[] hash = new int[N+1];
        for(int i = 0 ; i < N; i ++){
            hash[nums[i]] = 1;
        }
        for(int i = 1; i < hash.length; i ++){
            if(hash[i] == 0){
                return i;
            }
        }
        return 0;
    }
  
  //Optimal Approach 1 - T. C = O(N), S. C = O(1)
    public int missingNumber2(int[] nums) {
        int sum = 0;
        int N = nums.length;
        int res = 0;
        for(int i = 0; i < nums.length; i ++){
            sum+= nums[i];
        }
        res = (N *(N+1))/2 - sum;
        return res;
    }
  
  //Optimal Approach 2 - T. C = O(N), S. C = O(1)
    public int missingNumber(int[] nums) {
        int x1 =0, x2 =0;
        for(int i = 1; i <= nums.length; i++){
            x1 ^= i;
        }
        for(int i = 0; i < nums.length; i ++){
            x2 ^= nums[i];
        }
        return x1 ^ x2;
    }
}
