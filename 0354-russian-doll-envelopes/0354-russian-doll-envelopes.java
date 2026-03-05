import java.util.*;

class Solution {
    public int maxEnvelopes(int[][] envelopes) {

        Arrays.sort(envelopes, (a, b) -> {
            if (a[0] == b[0]) return b[1] - a[1];
            return a[0] - b[0];
        });

        List<Integer> list = new ArrayList<>();

        for (int[] e : envelopes) {
            int h = e[1];

            int idx = Collections.binarySearch(list, h);

            if (idx < 0) idx = -(idx + 1);

            if (idx == list.size())
                list.add(h);
            else
                list.set(idx, h);
        }

        return list.size();
    }
}