
public class Solution {
    /**
     * @param a: sorted integer array A
     * @param b: sorted integer array B
     * @return: A new sorted integer array
     */
    public int[] mergeSortedArray(int[] a, int[] b) {
        // write your code here
        if(a==null||b==null){
            return null;
        }
        int[] result=new int[a.length+b.length];
        int i=0,j=0,index=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                result[index++]=a[i++];
            } else{
                result[index++]=b[j++];
            }
        }
        while(i<a.length){
            result[index++]=a[i++];
        }
        while(j<b.length){
            result[index++]=b[j++];
        }
        return result;        
    }
}
//two pointer time:O(n)