class Solution {
  // Brute Force Approach 
    public int findLongestConseqSubseq(int[] arr) {
        int n = arr.length, longest = 1;
        for(int i = 0; i < n ; i ++){
            int x = arr[i], count = 1;
            while (linearSearch(arr, x + 1) == true) {
            x += 1;
            count += 1;
            }

            longest = Math.max(longest, count);
        }
        return longest;
    }
    public static boolean linearSearch(int []a, int num) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            if (a[i] == num)
                return true;
        }
        return false;
    }
  // Better Approach
    public int findLongestConseqSubseq1(int[] arr) {
        // code here
        
        int n = arr.length, longest = 1, count = 1;
        if (n == 0) {
            return 0;
        }

        Arrays.sort(arr);
        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) {
                continue;
            } else if (arr[i] == arr[i - 1] + 1) {
                count++;
            } else {
                longest = Math.max(longest, count);
                count = 1;
            }
        }
        longest = Math.max(longest, count);

        return longest;
    }
  // Optimal Approach
    public int findLongestConseqSubseq2(int[] arr) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        int longest = 0;
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int count = 1;
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    count++;
                }

                longest = Math.max(longest, count);
            }
        }

        return longest;
    }
}
