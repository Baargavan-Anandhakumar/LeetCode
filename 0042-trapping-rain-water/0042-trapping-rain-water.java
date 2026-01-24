class Solution {
    public int trap(int[] height) {
        int left=0;
        int right=height.length-1;
        int lm=height[0];
        int rm=height[height.length-1];
        int water=0;
        while(left<right)
        {
            if(lm<rm)
            {
                left++;
                lm=Math.max(lm,height[left]);
                water=water+lm-height[left];
            }
            else
            {
                right--;
                rm=Math.max(rm,height[right]);
                water=water+rm-height[right];
            }
        }
        return water;
    }
}