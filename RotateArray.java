class RotateArray {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n ;
        reverse(nums,n-k,n-1);
        reverse(nums,0,n-k-1);
        reverse(nums,0,n-1);
    }
    public static void reverse(int[] nums, int start, int end){
        int temp =0;
        while(start <= end){
            temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            end --;
            start ++;
        }
    }
}
