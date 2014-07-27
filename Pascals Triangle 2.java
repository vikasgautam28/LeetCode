public class Solution {
    public ArrayList<Integer> getRow(int rowIndex) {
        
         ArrayList<ArrayList<Integer>> list=generate(rowIndex+1);
         
         return list.get(list.size()-1);
    }
    
    public ArrayList<ArrayList<Integer>> generate(int numRows) {
        
        ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();
        
        if(numRows==0)
        return list;
        
        ArrayList<Integer> lst=new ArrayList<Integer>();
        lst.add(1);
        list.add(lst);
        
        if(numRows==1)
        return list;
        else {
            for(int i=1;i<numRows;i++)
            {
                ArrayList<Integer> prev=list.get(i-1);
                ArrayList<Integer> curr=new ArrayList<Integer>();
                curr.add(1);
                for(int j=1;j<i+1;j++)
                {
                    if(j==i)
                    curr.add(1);
                    else
                    curr.add(prev.get(j-1)+prev.get(j));
                }
                
                list.add(curr);
                
            }
        }
        
        return list;
        
    }
}