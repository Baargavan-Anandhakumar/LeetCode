class Solution {
    public int minimumPushes(String word) {
        Map<Character, Integer> map = new HashMap<>();
        char ch[] = word.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            map.put(ch[i], map.getOrDefault(ch[i], 0) + 1);
        }
        List<Integer> list = new ArrayList<>();
        for (Map.Entry<Character, Integer> temp : map.entrySet())
            list.add(temp.getValue());
        Collections.sort(list, Collections.reverseOrder());
        int res = 0;
        for (int i = 0; i < list.size(); i++) {
            res = res + ((i / 8) + 1) * list.get(i);
        }
        return res;
    }
}