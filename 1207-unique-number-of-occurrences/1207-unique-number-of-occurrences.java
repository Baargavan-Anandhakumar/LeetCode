class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (Map.Entry<Integer, Integer> temp : map.entrySet()) {
            list.add(temp.getValue());
            set.add(temp.getValue());
        }
        return list.size() == set.size() ? true : false;
    }
}