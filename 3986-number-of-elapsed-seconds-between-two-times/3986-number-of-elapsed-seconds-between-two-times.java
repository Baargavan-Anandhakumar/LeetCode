class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        String st[]=startTime.split(":");
        String en[]=endTime.split(":");
        int time=3600;
        int l=0;
        int f=0;
        for(int i=0;i<st.length;i++)
        {
            l=l+Integer.parseInt(st[i])*time;
            f=f+Integer.parseInt(en[i])*time;
            time/=60;
        }
        return f-l;
    }
}