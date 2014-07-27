public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int m=matrix.length;
        int n=matrix[0].length;
        
        for(int i=0;i<m;i++)
        {
            if(matrix[i][n-1]>=target)
            {
                return binarySearch(matrix[i],0,n-1,target);
            }
        }
        return false;
    }
    
    public boolean binarySearch(int[] A, int l, int r, int x)
    {
        
        if(l<=r)
        {
            int m=l+(r-l)/2;
            
            if(A[m]==x)
                return true;
            else if(A[m]>x)
                return binarySearch(A,l,m-1,x);
            else
                return binarySearch(A,m+1,r,x);
            
        }
        
        return false;
        
    }
}