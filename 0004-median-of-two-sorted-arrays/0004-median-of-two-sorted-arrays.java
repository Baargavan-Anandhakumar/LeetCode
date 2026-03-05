import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        
        if(nums1.length == 0 && nums2.length == 0)
            return 0;


        if(nums1.length == 0)
        {
            int n = nums2.length;
            if(n % 2 == 0)
                return ((double)nums2[n/2 - 1] + nums2[n/2]) / 2;
            else
                return nums2[n/2];
        }

        if(nums2.length == 0)
        {
            int n = nums1.length;
            if(n % 2 == 0)
                return ((double)nums1[n/2 - 1] + nums1[n/2]) / 2;
            else
                return nums1[n/2];
        }

        int res[] = new int[nums1.length + nums2.length];

        for(int i = 0; i < res.length; i++)
        {
            if(i >= nums1.length)
                res[i] = nums2[i - nums1.length];
            else
                res[i] = nums1[i];
        }

        Arrays.sort(res);

        int n = res.length;

        if(n % 2 != 0)
            return res[n/2];
        else
            return ((double)res[n/2 - 1] + res[n/2]) / 2;
    }
}