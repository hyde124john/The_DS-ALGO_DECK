class Solution {
//BRUTE- FORCE
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        List<Integer> l = new ArrayList<>();
        for(int i = 0; i < n; i ++){
            if(nums[i] != 0){
                l.add(nums[i]);
            }
        }
        for(int i = 0; i < n; i ++){
            if(i < l.size()){
                nums[i] = l.get(i);
            }
            else{
                nums[i] = 0;
            }
        }
    }
//OPTIMAL
    public void moveZeroes2(int[] nums) {
        int j = -1, n = nums.length;
        for(int i = 0 ; i <n;i ++){
            if(nums[i] ==0){
                j = i;
                break;
            }
        }
        if(j == -1){
            return;
        } 
        for(int i = j+1; i < n; i ++){
            if(nums[i] != 0){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }
}
