class searchInsert_35 {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int low = 0, high = n -1, ans = n;
        while(low <= high){
            int mid = (low + high) / 2;
            if(nums[mid] >= target){
                ans = mid;
                high = mid - 1;
            }
            else{
                
                low = mid + 1; 
            }
        }
        return ans;
    }
}
