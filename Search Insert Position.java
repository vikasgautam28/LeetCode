public class Solution {
    public int searchInsert(int[] A, int target) {
        
        return binarySearch(A,0,A.length-1,target);

    }
    
    public int binarySearch(int A[], int l, int r, int x)
    {
        if(l<=r)
        {
            int m=l+(r-l)/2;
            
            if(x==A[m]){
                return m;
            }
            else if(x<A[m])
            {
              return  binarySearch(A,l,m-1,x);   
            }
            else
            {
                return  binarySearch(A,m+1,r,x);
            }
        }
        
        else
        return l;
        
        
    }
}