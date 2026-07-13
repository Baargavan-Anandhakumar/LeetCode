class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        int i = 0;
        while(i<nums.length){
            int start = nums[i];
            String s = nums[i]+"";
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]-1==nums[j-1])
                    i++;
                else
                    break;
            }
            if(nums[i]==start)
                res.add(s);
            else{
                s += "->";
                s += nums[i]+"";
                res.add(s);
            }
            i++;
        }
        return res;
    }
}