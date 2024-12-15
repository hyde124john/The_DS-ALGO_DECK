class generatePascal118 {
  //Type 1
    public List<List<Integer>> generate(int numRows) {
         List<List<Integer>> result = new ArrayList<>();
        if (numRows == 0) {
            return result;
        }

        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        result.add(firstRow);

        for (int i = 1; i < numRows; i++) {
            List<Integer> prevRow = result.get(i - 1);
            List<Integer> currentRow = new ArrayList<>();
            currentRow.add(1);

            for (int j = 1; j < i; j++) {
                currentRow.add(prevRow.get(j - 1) + prevRow.get(j));
            }

            currentRow.add(1);
            result.add(currentRow);
        }

        return result;
    }
  //type 2
    ArrayList<Integer> nthRowOfPascalTriangle(int row) {
          // code here
          long ans = 1;
          ArrayList<Integer> ansRow = new ArrayList<>();
          ansRow.add(1); //inserting the 1st element
  
          //calculate the rest of the elements:
          for (int col = 1; col < row; col++) {
              ans = ans * (row - col);
              ans = ans / col;
              ansRow.add((int)ans);
          }
          return ansRow;
      }
}
