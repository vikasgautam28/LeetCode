public class Solution {
    public void sortColors(int[] A) {
        
        int[] count=new int[3];
        
        for(int i=0;i<A.length;i++)
        {
            count[A[i]]=count[A[i]]+1;
        }
        int iter=0;
        for(int i=0;i<count.length;i++)
        {
            int n=count[i];
            for(int j=0;j<n;j++)
            {
                A[iter]=i;
                iter++;
            }
        }
    }
}