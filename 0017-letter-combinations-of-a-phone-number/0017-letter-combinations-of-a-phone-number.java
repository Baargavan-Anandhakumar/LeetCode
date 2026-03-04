class Solution {
    static Map<Character, String> map ;
    static List<String> list ;

    static void tracking(String x, StringBuilder sb, int ind) {
        if (ind == x.length()) {
            list.add(sb.toString());
            return;
        }
        String s = map.get(x.charAt(ind));
        for(char i:s.toCharArray())
        {
            sb.append(i);
            tracking(x,sb,ind+1);
            sb.deleteCharAt(sb.length()-1);
        }
    }

    public List<String> letterCombinations(String digits) {
        map= new HashMap<>();
        list= new ArrayList<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        tracking(digits, new StringBuilder(), 0);
        return list;
    }
}