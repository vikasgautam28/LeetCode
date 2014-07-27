public class Solution {
    public boolean isPalindrome(int x) {
        
        if(x<0)
            return false;
        else
        return x==reverse(x);
    }
    
    public int reverse(int x)
    {
        
        int n=0;
        
        while(x>0)
        {
            n=n*10+(x%10);
            x=x/10;
        }
        
        return n;
        
    }
    
}