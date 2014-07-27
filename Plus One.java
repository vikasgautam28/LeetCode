public class Solution {
    public int[] plusOne(int[] digits) {
        
        if(digits.length==0)
            return digits;
        else
        {
            int flag=0;
            int[] temp;
            if(digits[0]==9 && digits[digits.length-1]==9)
            {
                flag=1;
                temp=new int[digits.length+1];
            }
            else
            {
                temp=new int[digits.length];
            }
            
            for(int i=digits.length-1;i>=0;i--)
            {
                if(digits[i]<9)
                {
                    if(flag==1)
                    temp[i+1]=digits[i]+1;
                    else
                    {
                        temp[i]=digits[i]+1;
                        
                        for(int j=i-1;j>=0;j--)
                        {
                            temp[j]=digits[j];
                        }
                        break;
                    }
                    
                }
                else
                {
                    if(flag==1)
                    temp[i+1]=0;
                }
            }
            
            if(flag==1)
            temp[0]=1;
            
            return temp;
        }
    }
}