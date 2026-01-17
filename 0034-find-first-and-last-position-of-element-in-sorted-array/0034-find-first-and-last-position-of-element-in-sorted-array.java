class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = search(nums, target, true);
        int right = search(nums, target, false);
        int arr[] = new int[2];
        arr[0] = left;
        arr[1] = right;
        return arr;
    }

    static int search(int[] nums, int target, boolean left) {
        int st = 0;
        int end = nums.length - 1;
        int res = -1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (nums[mid] == target) {
                res = mid;
                if (left)
                    end = mid - 1;
                else
                    st = mid + 1;
            } else if (nums[mid] > target)
                end = mid - 1;
            else
                st = mid + 1;
        }
        return res;
    }
}