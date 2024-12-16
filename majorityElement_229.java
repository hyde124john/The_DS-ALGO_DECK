class majorityElement_229 {
  //Better Approach Using extr space
  public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> mpp = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        for(int i = 0;i < n; i ++){
            mpp.put(nums[i], mpp.getOrDefault(nums[i], 0) + 1);
        }
        for(Map.Entry<Integer, Integer> it: mpp.entrySet()){
            if(it.getValue() > n/3){
                ans.add(it.getKey());
            }
        }
        return ans;
    }
  //Optimal Approach Using Moores Voting Alogoritm
    public List<Integer> majorityElement1(int[] nums) {
        int n = nums.length, cnt1 = 0, cnt2 = 0;
        int el1 = Integer.MIN_VALUE, el2 = Integer.MIN_VALUE;
        //Finding the required el1 & el2 using Moores voting algo
        for(int i = 0; i < n; i ++){
            if(cnt1 == 0 && nums[i] != el2){
                cnt1 = 1;
                el1 = nums[i];
            }
            else if(cnt2 == 0 && nums[i] != el1){
                cnt2 = 1;
                el2 = nums[i];
            }
            else if(nums[i] == el1){
                cnt1 ++;
            }
            else if(nums[i] == el2){
                cnt2 ++;
            }
            else{
                cnt1 --;
                cnt2 --;
            }
        }
        List<Integer> ans = new ArrayList<>();
        cnt1 = 0;
        cnt2 = 0;
        for(int i = 0; i < n; i ++){
            if(el1 == nums[i]) cnt1 ++;
            else if(el2 == nums[i]) cnt2 ++;
        }
        int thresh = (int)(n/3 + 1);
        if(cnt1 >= thresh) ans.add(el1);
        if(cnt2 >= thresh) ans.add(el2);
        Collections.sort(ans);
        return ans;
     }
}
