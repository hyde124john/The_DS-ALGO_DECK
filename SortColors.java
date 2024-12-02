class Solution {
  //Brute Force T. C - O(NlogN) S. C - O(1)
    public void sortColors(int[] nums) {
        Arrays.sort(nums);
    }
  //Better Approach T. C - O(2 * N) == O(N), S. C - O(1)
    public void sortColors(int[] nums) {
        int count0 = 0, count1 = 0, count2 = 0;
        for(int num : nums){
            if(num == 0)
                count0++;
            else if(num == 1)
                count1++;
            else
                count2++;
        }
        for(int i = 0; i < count0; i ++){
            nums[i] = 0;
        }
        for(int i = count0; i < count0+count1; i ++){
            nums[i] = 1;
        }
        for(int i = count0 + count1; i < nums.length; i ++){
            nums[i] = 2;
        }
    }
  //Optimal Approach [Dutch National Flag Algorithm] T. C - O(N) S. C - O(1)
    public void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length -1;
        while(mid <= high){
            if(nums[mid] == 0){
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low ++;
                mid ++;
            }
            else if(nums[mid] == 1){
                mid ++;
            }
            else{
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high --;
            }
        }
    }
}
