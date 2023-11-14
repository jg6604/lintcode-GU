public class Solution {
    /**
     * @param nums: A list of integer which is 0, 1 or 2
     * @return: nothing
     */
     //two pointer
    public void sortColors(int[] nums) {
        // write your code here
        if(nums==null||nums.length==0){
            return;
        }
        quickSort(nums,0,nums.length-1);
    }
    private void quickSort(int[] nums, int start, int end){
        if(start>=end){
            return;
        }
        int left=start,right=end;
        int pivot=nums[(start+end)/2];
        while(left<=right){
            while(left<=right&&nums[left]<pivot){
                left++;
            }
            while(left<=right&&nums[right]>pivot){
                right--;
            }
            if(left<=right){
                int temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
                left++;
                right--;
            }
        }
        quickSort(nums,start,right);
        quickSort(nums,left,end);
    }
}
//time O(nlog n) space O(1)