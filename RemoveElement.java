public class Solution {
    public int removeElement(int[] A, int elem) {
        
        int length=A.length;
        int iter=0;
        while(iter<length)
        {
            if(A[iter]==elem)
            {
                length--;
                for(int j=iter;j<A.length-1;j++)
                {
                    A[j]=A[j+1];
                }
            }
            else
            {
                iter++;
            }
        }
        
        return length;
        
    }
}