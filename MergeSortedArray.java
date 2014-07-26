public class Solution {
    public void merge(int A[], int m, int B[], int n) {
        
        int p=0;
        int q=0;
        
        if(m==0)
        {
            for(int j=0;j<n;j++)
            {
                A[j]=B[j];
            }
        }
        else
        {
            
            while(p<m && q<n)
            {
                if(A[p]>B[q])
                {
                    for(int j=m;j>p;j--)
                    {
                        A[j]=A[j-1];
                    }
                    
                    A[p]=B[q];
                    q++;
                    p++;
                    m++;
                }
                else
                {
                    p++;
                }
            }
            
            if(p==m && q<n)
            {
                for(int j=q;j<n;j++)
                {
                    A[p]=B[j];
                    p++;
                }
            }
        }
    }
}