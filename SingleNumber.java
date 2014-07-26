public class Solution {
    public int singleNumber(int[] A) {
        
        
        
        if(A.length>0)
        {
            int num=0;
        
            for(int i=0;i<A.length;i++)
            {
               num=num^A[i];
            }
            
            return num;
        }
        else
        {
            return 0;
        }
}
}