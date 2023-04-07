/*https://leetcode.com/problems/last-stone-weight/description/ */


class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer>heap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<stones.length;i++){
            heap.add(stones[i]);
        }
        while(heap.size()>1){
            int x = heap.poll();
            int y = heap.poll();

            if(x-y>0)
                heap.add(x-y);
            
        }
        if(heap.size()==1)
            return heap.poll();
        else
            return 0;
        
        
            }
}
