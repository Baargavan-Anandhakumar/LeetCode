class Solution {
    public int carFleet(int target, int[] position, int[] speed) {

        int n = position.length;

        int[][] arr = new int[n][2];

        for(int i = 0; i < n; i++) {
            arr[i][0] = position[i];
            arr[i][1] = speed[i];
        }

        Arrays.sort(arr, (a,b) -> a[0] - b[0]);

        int fleet = 0;

        double lastTime = -1;

        for(int i = n - 1; i >= 0; i--) {

            int pos = arr[i][0];
            int spd = arr[i][1];

            double currTime = (target - pos) / (double)spd;

            if(currTime > lastTime) {
                fleet++;
                lastTime = currTime;
            }
            else {
                continue;
            }

        }

        return fleet;
    }
}