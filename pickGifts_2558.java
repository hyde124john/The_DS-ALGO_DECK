class pickGifts_2558 {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> maxHeap = new    PriorityQueue<>(Collections.reverseOrder());
        for (int gift : gifts) {
            maxHeap.add(gift);
        }
        
        while (k-- > 0) {
            int curr = maxHeap.poll();
            maxHeap.add((int) Math.sqrt(curr));
        }
        
        long sum = 0;
        while (!maxHeap.isEmpty()) {
            sum += maxHeap.poll();
        }
        return sum;
    }
}
