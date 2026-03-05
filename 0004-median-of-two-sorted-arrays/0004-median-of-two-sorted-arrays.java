class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        if (nums1.length == 0 && nums2.length == 0)
            return 0;

        if (nums1.length == 0) {
            int n = nums2.length;
            if (n % 2 == 0)
                return ((double) nums2[n / 2 - 1] + nums2[n / 2]) / 2;
            else
                return nums2[n / 2];
        }

        if (nums2.length == 0) {
            int n = nums1.length;
            if (n % 2 == 0)
                return ((double) nums1[n / 2 - 1] + nums1[n / 2]) / 2;
            else
                return nums1[n / 2];
        }
        int m = nums1.length;
        int n = nums2.length;

        int[] res = new int[m + n];
        int i = 0, j = 0, k = 0;

        while (i < m && j < n) {
            if (nums1[i] <= nums2[j])
                res[k++] = nums1[i++];
            else
                res[k++] = nums2[j++];
        }

        while (i < m)
            res[k++] = nums1[i++];

        while (j < n)
            res[k++] = nums2[j++];

        int r = res.length;

        if (r % 2 != 0)
            return res[r / 2];
        else
            return ( res[r / 2 - 1] + res[r / 2]) / 2.0;
    }
}