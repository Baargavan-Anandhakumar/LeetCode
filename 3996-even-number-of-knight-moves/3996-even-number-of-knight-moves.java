class Solution {
    public boolean canReach(int[] start, int[] target) {
        int od = start[0] + start[1];
        int ev = target[0] + target[1];
        if (od % 2 == ev % 2)
            return true;
        return false;
    }
}