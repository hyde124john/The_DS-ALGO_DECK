class  MergeSort{
    void mergeSort(int arr[], int l, int r) {
        // code here
        int mid = (l + r)/2;
        if(l >= r){
            return;
        }
        mergeSort(arr, l , mid);
        mergeSort(arr, mid+1,r);
        merge(arr,l,mid,r);
    }
    static void merge(int[] arr, int low, int mid, int high){
        List<Integer> nums = new ArrayList<>();
        int left = 0, right = mid+1;
        while(left <= mid && right <= high){
            if(arr[left] < arr[right]){
                nums.add(arr[left]);
                left ++;
            }
            else{
                nums.add(arr[right]);
                right ++;
            }
        }
        while(left <= mid){
            nums.add(arr[left]);
        }
        while(right <= high){
            nums.add(arr[right]);
        }
        for(int i = low; i < high; i ++){
            arr[i] = nums.get(i - low);
        }
    }  
}
