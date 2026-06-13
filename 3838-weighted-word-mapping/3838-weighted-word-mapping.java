class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        HashMap<Integer,Character> h = new HashMap<>();
        char ch = 122;
        for(int i=0;i<26;i++){
            h.put(i,ch--);
        }
        StringBuilder res =new StringBuilder();
        for(int i=0;i<words.length;i++){
            String s = words[i];
            int sum = 0;
            for(int j=0;j<s.length();j++){
                char c = s.charAt(j);
                sum += weights[c-97];
            }
            res = res.append(h.get(sum%26));
        }
        String s=res.toString();
        return s;
    }
}