class Solution {
    public int minPenalty(int period, int[] lights, int[] arrivalTime) {
        int max = Integer.MIN_VALUE;
        for (int i : lights) {
            if (max < i)
                max = i;
        }
        int ans = 0;
        for (int i = 0; i < arrivalTime.length; i++) {
            if (arrivalTime[i] % period >= max) {
                ans = Math.max(ans, period - arrivalTime[i] % period);
            }
        }
        return ans;
    }
}