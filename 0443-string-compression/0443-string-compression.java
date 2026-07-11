class Solution {
    public int compress(char[] chars) {
        int i=0,n = chars.length;
        String str = "";
        while(i<n){
            int count = 0,j=i;
            for(j=i;j<n;j++){
                if(chars[i]==chars[j])
                    count++;
                else 
                    break;
            }
            if(count>1){
                str += chars[i];
                str +=  count+"";
            }
            else
                str += chars[i];
            i = j;
        }
        System.out.print(str);
        i=0;
        for(i=0;i<str.length();i++){
            chars[i] = str.charAt(i);
        }
        return str.length();
    }
}