class subarrayXor {
  //Better Approach
    public long subarrayXor1(int arr[], int m) {
        // code here
        int n = arr.length, count = 0;
        for(int i = 0; i < n; i ++){
            int xor = 0;
            for(int j = i; j < n; j ++){
                xor ^= arr[j];
                if(xor == m){
                    count ++;
                }
            }
        }
        return count;
    }
//optimazl approach using hashmap 
  public long subarrayXor(int arr[], int m) {
        // code here
        int n = arr.length, count = 0, xor = 0;
        Map<Integer, Integer> mpp = new HashMap<>();
        mpp.put(0,1);
        
        for(int i = 0; i < n; i ++){
            xor ^= arr[i];
            int x = xor ^ m;
            if(mpp.containsKey(x)){
                count += mpp.get(x);
            }
            if(mpp.containsKey(xor)){
                mpp.put(xor, mpp.get(xor) + 1);
            }
            else{
                mpp.put(xor, 1);
            }
        }
        return count;
    }
}
