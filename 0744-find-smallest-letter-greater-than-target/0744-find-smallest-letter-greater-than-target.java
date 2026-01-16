class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int st=0;
        int end=letters.length-1;
        int mid=0;
        while(st<=end)
        {
            mid=st+(end-st)/2;
            if(letters[mid]<=target)
            st=mid+1;
            else
            end=mid-1;
        }
        if(st==letters.length)
        return letters[0];
        return letters[st];
    }
}