public class Solution {
    public void sortIntegers2(int[] a) {
        // write your code here
        if(a==null || a.length==0){
            return;
        }
        quickSort(a,0,a.length-1);
    }
    private void quickSort(int[] a, int start, int end){
        if(start>=end){
            return;
        }
        int left=start,right=end;
        //1.pivot,not a[start],a[end]
        //get value not index
        int pivot=a[(start+end)/2];
        //2.left<=right not left<right
        while(left<=right){
            while(left<=right && a[left]<pivot){
                left++;
            }
            while(left<=right && a[right]>pivot){
                right--;
            }
            if(left<=right){
                int temp=a[left];
                a[left]=a[right];
                a[right]=temp;
                left++;
                right--;
            }
        }
        quickSort(a,start,right);
        quickSort(a,left,end);
    }
}