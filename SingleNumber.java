class Solution {
//Find the number that appears once, and other numbers twice.
//Brute Force
    public int singleNumber(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < n; i ++){
            int num = nums[i];
            int count = 0;
            for(int j = 0; j < n; j ++){
                if(nums[j] == num){
                    count++;
                }
            }
            if(count == 1){
                return num;
            }
        }
        return -1;
    }
  //Better Approach
    public int singleNumber1(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> h = new HashMap<>();
        for(int i = 0; i < n; i ++){
            int value = h.getOrDefault(nums[i],0);
            h.put(nums[i],value+1);
        }
        for(Map.Entry<Integer, Integer> i : h.entrySet()){
            if(i.getValue() == 1){
                return i.getKey();
            }
        }
        return -1;
    }
  //Optimal Approach
    public int singleNumber2(int[] nums) {
        int xor = 0;
        for(int i = 0; i < nums.length; i ++){
            xor ^= nums[i];
        }
        return xor;
    }
}
