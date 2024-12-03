class AddSpaces {
    //T. C - O(N), S. C - O(N)
    public String addSpaces(String s, int[] spaces) {
        StringBuilder res = new StringBuilder();
        int s1 = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s1 < spaces.length && spaces[s1] == i) {
                res.append(" "); 
                s1++; 
            }
            res.append(s.charAt(i));
        }

        return res.toString();
    }
}
