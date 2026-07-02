class Solution {
    public boolean validDigit(int n, int x) {
        String a=n+"";       
        if((a.charAt(0)+"").equals(x+""))
        return false;
        if(a.contains(x+""))
        return true;
        return false;
    }
}