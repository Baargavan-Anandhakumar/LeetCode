class Solution {
    public int[] scoreValidator(String[] events) {
       int arr[]=new int[2];
       int sum=0;
       int count=0;
        for(int i=0;i<events.length;i++)
        {
            String s=events[i];
            if(count>=10)
            break;
            else if(s.equals("0") || s.equals("1")|| s.equals("2")|| s.equals("3")|| s.equals("4")||s.equals("5")||s.equals("6"))
            sum+=Integer.parseInt(s);
            else if(s.equals("W") && count<10)
            count+=1;
            else 
            sum+=1;
        }
        arr[0]=sum;
        arr[1]=count;
        return arr;
    }
}