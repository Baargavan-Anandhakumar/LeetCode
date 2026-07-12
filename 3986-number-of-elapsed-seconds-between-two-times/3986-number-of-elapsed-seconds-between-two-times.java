class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        String start[] = startTime.split(":");
        String end[] = endTime.split(":");
        int st = 0,e = 0;
        int time = 3600;
        for(int i=0;i<3;i++){
            st += Integer.parseInt(start[i])*time;
            e += Integer.parseInt(end[i])*time;
            time /= 60;
        }
        return e-st;
    }
}