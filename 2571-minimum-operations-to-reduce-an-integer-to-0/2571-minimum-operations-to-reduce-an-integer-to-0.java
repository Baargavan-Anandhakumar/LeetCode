class Solution {
    public int minOperations(int n) {
        List<Integer> pow = new ArrayList<>();

        for(int i = 0; (1 << i) <= 2 * n; i++){
            pow.add(1 << i);
        }

        int ans = 0;

        while(n > 0){
            int closest = pow.get(0);

            for(int p : pow){
                if(Math.abs(n - p) < Math.abs(n - closest)){
                    closest = p;
                }
            }

            n = Math.abs(n - closest);
            ans++;
        }

        return ans;
    }
}