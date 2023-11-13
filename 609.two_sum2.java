public class Solution {
    public int twoSum5(int[] nums, int target) {
        // write your code here
        //two pointer
        Arrays.sort(nums);
        int count=0;
        int left=0,right=nums.length-1;
        while(left<right){
            int curSum=nums[left]+nums[right];
            if(curSum<=target){
                count+=right-left;
                left++;
            } else{
                right--;
            }
        }
        return count;
    }
}