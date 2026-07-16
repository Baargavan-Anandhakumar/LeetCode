class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < pivot) {
                list.add(nums[i]);
            }

        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == pivot) {
                list.add(pivot);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > pivot) {
                list.add(nums[i]);
            }
        }
        int res[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}