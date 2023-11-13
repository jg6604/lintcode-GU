public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // write your code here
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<numbers.length;i++){
            int complement=target-numbers[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(numbers[i],i);
        }
        return new int[]{-1,-1};       
    }
}