class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int sum = 0;

        for (int i = 0; i <= heights.length; i++) {
            int temp = 0;
            if (i != heights.length)
                temp = heights[i];
            while (!st.isEmpty() && temp < heights[st.peek()]) {
                int h = heights[st.pop()];
                int w = 0;
                if (st.isEmpty())
                    w = i;
                else
                    w = i - st.peek() - 1;
                sum = Math.max(sum, h * w);
            }
            st.push(i);
        }
        return sum;
    }
}
