class Solution {
  //Brute Force Approach T.C - O(N^2) S.C - O(1)
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length; 
        for(int i = 0; i < n; i ++){
            for(int j = 0; j < n; j ++){
                if(i == j){
                    continue;
                }
                if(nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
  //Better Approach T.C - O(NlogN) S.C -O(N)
    public int[] twoSum1(int[] nums, int target) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for(int i = 0; i < nums.length; i ++){
            int diff = target - nums[i];
            if(mpp.containsKey(diff)){
                return new int[]{mpp.get(diff), i};
            }
            mpp.put(nums[i],i);
        }
        return new int[]{-1, -1};
    }
  //Optimal Approach (does not work in Leetcode)
    boolean twoSum2(int arr[], int target) {
        // code here
        Arrays.sort(arr);
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                return true;
            } else if (sum < target) left++;
            else right--;
        }
        return false;
    }
}
