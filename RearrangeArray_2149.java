class RearrangeArray_2149 {
  //Brute Force Approach T. C - O(N) S. C - O(N)
    public int[] rearrangeArray(int[] nums) {
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();
        for(int num : nums){
            if(num >= 0){
                pos.add(num);
            }
            else{
                neg.add(num);
            }
        }
        for(int i = 0; i < nums.length/2; i ++){
            nums[i*2] = pos.get(i);
            nums[i*2 + 1] = neg.get(i);
        }
        return nums;
    }
  //Optimal Approach T. C - O(N) S. C - O(N) - Solves in 
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length, pos = 0, neg = 1;
        int[] arr = new int[n];
        for(int i =0 ; i < n ; i ++){
            if(nums[i] > 0){
                arr[pos] = nums[i];
                pos += 2;
            }
            else{
                arr[neg] = nums[i];
                neg += 2;
            }
        }
        return arr;
    }
  // Variety 2 GFG
    void rearrange(ArrayList<Integer> arr) {
          // code here
          List<Integer> pos = new ArrayList<>();
          List<Integer> neg = new ArrayList<>();
          
          for (int num : arr) {
              if (num >= 0) {
                  pos.add(num);
              } else {
                  neg.add(num);
              }
          }
          int posIndex = 0, negIndex = 0, i = 0;
          
          while (posIndex < pos.size() && negIndex < neg.size()) {
              arr.set(i++, pos.get(posIndex++));
              arr.set(i++, neg.get(negIndex++));
          }
          while (posIndex < pos.size()) {
              arr.set(i++, pos.get(posIndex++));
          }
          while (negIndex < neg.size()) {
              arr.set(i++, neg.get(negIndex++));
          }
      }
}
