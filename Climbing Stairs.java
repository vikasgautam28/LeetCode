public class Solution {
    public int climbStairs(int n) {
        if(n == 0)
            return 0;
        if(n == 1)
            return 1;
        int[] steps = new int[n];
        steps[n-1] = 1;
        steps[n-2] = 2;
        for(int i=n-3; i>=0; i--)
            steps[i] = steps[i+1]+steps[i+2];
    
        return steps[0];
    }
}