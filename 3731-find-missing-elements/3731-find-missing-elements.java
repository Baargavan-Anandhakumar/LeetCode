class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        if (nums == null || nums.length == 0)
            return list;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++)
            set.add(nums[i]);
        int min = nums[0];
        int max = nums[nums.length - 1];
        for (int i = min; i <= max; i++) {
            if (!set.contains(i)) {
                list.add(i);
            }
        }
        return list;
    }
}