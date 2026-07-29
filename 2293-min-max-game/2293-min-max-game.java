class Solution {
    public int minMaxGame(int[] nums) {
        List<Integer> list  =new ArrayList<>();
        for(int i=0;i<nums.length;i++)
            list.add(nums[i]);
        while(true){
            if(list.size()==1)
                break;
            int size = list.size();
            boolean flag=false;
            for(int i=0;i<size;i+=2){
                if(!flag){
                    list.add(Math.min(list.get(i),list.get(i+1)));
                    flag=true;
                }
                else{
                    list.add(Math.max(list.get(i),list.get(i+1)));
                    flag=false;
                }
            }
            for(int i=0;i<size;i++)
                list.removeFirst(); 
        }
        return list.get(0);
    }
}