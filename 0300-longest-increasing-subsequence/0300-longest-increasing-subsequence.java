class Solution {
    public int lengthOfLIS(int[] nums) {
        int size = 0;
        int[] arr = new int[nums.length];
        for (int i=0;i<nums.length;i++) {
            int left = 0;
            int right = size;
            while (left < right) {
                int mid = left + (right - left) / 2;
                if (arr[mid] < nums[i]) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }
            arr[left] = nums[i];
            if (left == size) 
            size++;
        }

        return size;
    }
}