class Solution {
    public int maxArea(int[] arr) {
        int left=0;
        int right=arr.length-1;
        int max=0;
        while(left<right)
        {
            int min=Math.min(arr[left],arr[right]);
            int len=right-left;
            int area=len*min;
            max=Math.max(area,max);
            if(arr[left]<arr[right])
            {
                left++;
            }
            else
            right--;
        }
        return max;
    }
}