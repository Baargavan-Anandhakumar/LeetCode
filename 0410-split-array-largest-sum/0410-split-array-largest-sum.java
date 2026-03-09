class Solution {
    public int subarrayCount(int[] arr,int maxSize){
        int size = 1;
        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            if(sum+arr[i] <= maxSize){
                sum+=arr[i];
            }else{
                size++;
                sum = arr[i];
            }
        }
        return size;
    }
    public int splitArray(int[] arr, int k) {
        int start = 0;
        int end = 0;
        for(int i = 0;i<arr.length;i++){
            end+=arr[i];
            if(arr[i] > start) start = arr[i];
        }
        while(start<=end){
            int mid = start+(end-start)/2;
            int size = subarrayCount(arr,mid);
            if(size > k) start = mid+1;
            else end = mid-1;
        }
        return start;
    }
}