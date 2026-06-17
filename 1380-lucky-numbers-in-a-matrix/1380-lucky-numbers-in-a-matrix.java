class Solution {
    public List<Integer> luckyNumbers(int[][] arr) {
        List<Integer> l1=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
        int small=Integer.MAX_VALUE;
            for(int j=0;j<arr[i].length;j++)
            {
                small=Math.min(small,arr[i][j]);
            }
                l1.add(small);
        }

        for(int i=0;i<arr[0].length;i++)
        {
        int max=Integer.MIN_VALUE;
            for(int j=0;j<arr.length;j++)
            {
                max=Math.max(max,arr[j][i]);
            }
                l2.add(max);
        }
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                if(arr[i][j]==l1.get(i) && arr[i][j]==l2.get(j))
                {
                    list.add(l1.get(i));
                }
            }
        }
        return list;   
    }
}