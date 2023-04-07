/* https://leetcode.com/problems/top-k-frequent-elements/description/ */


class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        PriorityQueue<Integer>heap = new PriorityQueue<>(new Comparator<Integer>(){
            public int compare(Integer a,Integer b){
                return map.get(a)-map.get(b);
            }
        });

        //traversing hash maps through hash.keySet

        for(int x : map.keySet()){
            heap.add(x);
            if(heap.size()>k){
                heap.poll();
            }
        }
        //loop se bahar aake wo elements bachege jo size se bade hai


        int [] arr = new int[k];

        for(int i=0;i<k;i++){
            arr[i]=heap.poll();
        }
        return arr;
        
    }
}
