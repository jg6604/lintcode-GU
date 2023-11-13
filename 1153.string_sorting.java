public class Solution {
    /**
     * @param s: string
     * @return: sort string in lexicographical order
     */
    public String sorting(String s) {
        // write your code here
        String[] strings=s.split(",");
        quickSort(0,strings.length-1,strings);
        String ans="";
        for(int i=0;i<strings.length;i++){
            if(i>0){
                ans+=",";
            }
            ans+=strings[i];
        }
        return ans;
    }
    private void quickSort(int n, int m, String[] a){
        int i=n, j=m;
        String k=a[(i+j)/2];
        while(i<=j){
            while(a[i].compareTo(k)<0){
                i++;
            }
            while(a[j].compareTo(k)>0){
                j--;
            }
            if(i<=j){
                String tmp=a[i];
                a[i]=a[j];
                a[j]=tmp;
                i++;
                j--;
            }
        }
        if(i<m){
            quickSort(i,m,a);
        }
        if(n<j){
            quickSort(n,j,a);
        }
    }
}
//time O(nlogn)
