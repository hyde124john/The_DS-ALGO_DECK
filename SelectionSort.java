class SelectionSort {
    void selectionSort(int[] arr) {
        // code here
        int temp = 0;
        int n = arr.length;
        for(int i = 0; i <= n - 2; i ++){
            int min = i;
            for(int j = i ; j <= n -1 ; j ++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            //swap
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
}
