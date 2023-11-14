public class Solution {
    /**
     * @param a: An integer array
     * @param b: An integer array
     * @return: a double whose format is *.5 or *.0
     */
    public double findMedianSortedArrays(int[] a, int[] b) {
        // write your code here
        int n=a.length+b.length;
        if(n%2==0){
            return(
                findKth(a,0,b,0,n/2)+findKth(a,0,b,0,n/2+1)
            )/2.0;
        }
        return findKth(a,0,b,0,n/2+1);
    }
    //find kth number of two sorted array
    public static int findKth(int[] a, int start_of_a, int[] b, int start_of_b,int k){
        if(start_of_a>=a.length){
            return b[start_of_b+k-1];
        }
        if(start_of_b>=b.length){
            return a[start_of_a+k-1];
        }
        if(k==1){
            return Math.min(a[start_of_a],b[start_of_b]);
        }
        int half_kth_of_a=start_of_a+k/2-1<a.length?a[start_of_a+k/2-1]:Integer.MAX_VALUE;
        int half_kth_of_b=start_of_b+k/2-1<b.length?b[start_of_b+k/2-1]:Integer.MAX_VALUE;
        if(half_kth_of_a<half_kth_of_b){
            return findKth(a,start_of_a+k/2,b,start_of_b,k-k/2);
        } else{
            return findKth(a,start_of_a,b,start_of_b+k/2,k-k/2);
        }
    }
}
//time log(n+m) space O(1)