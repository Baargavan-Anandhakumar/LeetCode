/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int st=1;
        int end=n;
        int mid=0;
        int ind=0;
        while(st<=end)
        {
            mid=st+(end-st)/2;
            if(isBadVersion(mid)){
            ind=mid;
            end=mid-1;
            }
            else
            st=mid+1;
        }
        return ind;
    }
}