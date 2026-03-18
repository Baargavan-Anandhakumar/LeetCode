class Solution {
    public String removeDuplicates(String s, int k) {
        Deque<int[]> stack = new ArrayDeque<>();
        for(int i = 0 ; i < s.length() ; i++){
            int ch = (int)s.charAt(i);
            if(!stack.isEmpty()){
                int top[] = stack.peek();
                if(top[0] == ch){
                    top[1]++;
                    if(top[1] == k)
                    stack.pop();
                }
                else
                stack.push(new int[]{ch,1});
            }
            else
            stack.push(new int[]{ch,1});
        }

        StringBuilder result = new StringBuilder();
        while(!stack.isEmpty()){
            int top[] = stack.pop();
            for(int i = 0 ; i < top[1] ; i++){
                result.append((char) top[0]);
            }
        }

        return result.reverse().toString();
    }
}