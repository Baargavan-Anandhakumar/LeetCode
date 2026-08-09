class Solution {
    public double minPrice(int[] arr, int[] ar) {
        Arrays.sort(arr);
        Arrays.sort(ar);
        double ans=0;
        int f=arr.length-1;
        int s=ar.length-1;
        while(f>=0 && s>=0)
            {
                ans+=arr[f]*(100.0-ar[s])/100.0;
                f--;
                s--;
                System.out.println(ans);
            }
        while(f>=0)
        {
            ans+=arr[f];
            f--;
        }
        return ans;
        
        
    }
}