class MajorityElement {
  //Brute Force Approach T.C - O(N^2) S. C - O(1)
    public int majorityElement(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < n; i ++){
            int count = 0;
            for(int j = 0; j < n; j ++){
                if(nums[i] == nums[j]){
                    count ++;
                }
            }
            if(count > n/2){
                return nums[i];
            }
        }
        return 0;
    }
  //Better Approach T.C - O(N) S. C - O(N)
    public int majorityElement1(int[] nums) {
        Map<Integer, Integer> mpp = new HashMap<>();
        int n = nums.length;
        for(int i = 0; i < n; i++){
            int value = mpp.getOrDefault(nums[i],0);
            mpp.put(nums[i], value + 1 );
        }
        for(Map.Entry<Integer, Integer> it : mpp.entrySet()){
            if(it.getValue() > n/2){
                return it.getKey();
            }
        }
        return 0;
    }
  //Optimal Approach Moores Voting Algorithm T.C = O(N) S. C - O(1)
    public int majorityElement2(int[] nums) {
        int n = nums.length;
        int cnt =0,ele = 0;
        for(int i = 0; i < n; i ++){
            if(cnt == 0){
                cnt = 1;
                ele = nums[i];
            }
            else if(nums[i] == ele){
                cnt ++;
            }
            else{
                cnt --;
            }
        }
        int cnt1 = 0;
        for(int i = 0 ; i < n ; i ++){
            if(ele == nums[i]){
                cnt1 ++;
            }
        }
        if(cnt1 > n/2){
            return ele;
        }
        return 0;
    }
}
