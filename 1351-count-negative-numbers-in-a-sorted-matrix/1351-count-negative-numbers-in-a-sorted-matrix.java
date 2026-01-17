class Solution {
    public int countNegatives(int[][] grid) {
        int c=0;
        int st=0;
        int end=grid[0].length-1;
        while(st<grid.length && end>=0)
        {
            if(grid[st][end]<0)
            {
                c=c+(grid.length-st);
                end--;
            }
            else
            st++;
        }
        
        
        return c;
    }
}