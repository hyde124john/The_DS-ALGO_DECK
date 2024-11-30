class Solution {
  //Brute Force TLE FAIL T.C O(N^3)
    public int lenOfLongestSubarr(int[] arr, int k) {
        // code here
        int n = arr.length;
        int len =0;
        for(int i =0 ; i < n;i ++){
            for(int j = i; j < n; j ++){
                int sum = 0;
                for(int l = i; l <= j; l ++ ){
                    sum += arr[k];
                }
                if(sum == k){
                    len = Integer.max(len, j - i + 1);
                }
            }
        }
        return len;
    }

  //Slightly Enhanced TLE FAIL O(N^2)
    public int lenOfLongestSubarr(int[] arr, int k) {
        // code here
        int n = arr.length;
        int len =0;
        for(int i = 0; i < n; i ++){
            int sum= 0;
            for(int j = i; j < n; j ++){
                sum+=arr[j];
                if(sum == k){
                len = Integer.max(len, j - i + 1);
                }
            }
            
        }
        return len;
    }
  //Better Approach 
    public int lenOfLongestSubarr(int[] arr, int k) {
        // code here
        Map<Integer, Integer> h = new HashMap<>();
        int sum =0;
        int maxLen = 0;
        for(int i = 0; i < arr.length; i ++){
            sum += arr[i];
            if(sum == k){
                maxLen = Integer.max(maxLen, i + 1);
            }
            int rem = sum - k;
            if(h.containsKey(rem)){
                int len = i - h.get(rem);
                maxLen = Integer.max(maxLen, len);
            }
            if(!h.containsKey(sum)){
                h.put(sum, i);
            }
            
        }
        return maxLen;
    }
}
