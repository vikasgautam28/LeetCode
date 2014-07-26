public class Solution {
    public int reverse(int x) {
        
        int n=0;
        Boolean flag=false;
        if(x<0)
        {
            flag=true;
            x=-1*x;
        }
        
        while(x>=10)
        {
            n=n*10+(x%10);
            x=x/10;
        }
        
        n=n*10+x;
        if(flag)
        {
            n=-1*n;
        }
        return n;
    }
}