public class Solution {
    public double pow(double x, int n) {
        
        if(n==0)
            return 1;
        else{
            double p=pow(x,n/2);
            if(n%2==0)
                return p*p;
            else if(n<0)
                return (p*p)/x;
            else
               return x*p*p;
        }
    }
}