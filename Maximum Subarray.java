public class Solution {
    public int maxSubArray(int[] A) {
        
        int[] M=new int[A.length];
        M[0]=A[0];
        
        int maxSum=M[0];
        
        for(int j=1;j<A.length;j++)
        {
            M[j]=max(M[j-1]+A[j],A[j]);
            
            if(maxSum<M[j])
            {
                maxSum=M[j];
            }
        }
        
        return maxSum;
    }
    
    public int max(int a,int b){
        return a>b?a:b;
    }
    
}