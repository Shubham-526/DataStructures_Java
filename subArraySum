class Solution {
    public int subarraySum(int[] nums, int k) {
        int count =0;
        int[] prefix_sum_array = new int [nums.length];

        //creating a prefix sum array
        prefix_sum_array[0] = nums[0];
        for(int i =1; i<nums.length; i++){
            prefix_sum_array[i] = prefix_sum_array[i-1]+nums[i];
        }
        Map<Integer,Integer> countMap = new HashMap<>();

        /*adding 0  to count map which will basically store the count of occurence of element
          in the prefix_sum_array.
          */
        countMap.put(0,1);
        

        /** The core logic*/
        
        for(int i =0; i<prefix_sum_array.length; i++){
            if(countMap.containsKey(prefix_sum_array[i]-k)){
                count+=countMap.get(prefix_sum_array[i]-k);
            }
            if(countMap.containsKey(prefix_sum_array[i])){
                int element_count = countMap.get(prefix_sum_array[i]);
                countMap.put(prefix_sum_array[i],element_count+1);
            }else{
                countMap.put(prefix_sum_array[i],1);
            }
            
        }
        return count;

    }
}
