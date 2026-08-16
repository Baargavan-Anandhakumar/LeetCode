class Solution {
    public int minPenalty(int p, int[] lights, int[] at) {
        int max = 0;
        for (int light : lights) {
            max = Math.max(light, max);
        }
        int w = 0;
        for (int i = 0; i < at.length; i++) {
            int r = at[i] % p;
            if (r >= max) {
                w = Math.max(w, p - r);
            }
        }
        return w;
    }
}