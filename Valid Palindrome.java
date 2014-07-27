public class Solution {
    public boolean isPalindrome(String s) {
       s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        if(s.length()<2)
            return true;
        Stack<Character> stk=new Stack<Character>();
        int index=0;
        int l=s.length();
        while(index<l/2)
        {
            stk.push(s.charAt(index));
            index++;
        }
        
        if(l%2==1)
            stk.push(s.charAt(index));
            
        while(index<l)
        {
            char c=stk.pop();
            
            if(s.charAt(index)!=c)
                return false;
            else
                index++;
        }
        
        return true;
        
    }
}
 