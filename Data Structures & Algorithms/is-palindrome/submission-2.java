class Solution {
    public boolean isPalindrome(String s) {
        char[] chars=s.toCharArray();
        StringBuffer sb=new StringBuffer();
        for(char c :chars){
            if(c>=48 && c<=57){
                sb.append(c);
            }
            if(c>=65 && c<=91){
                sb.append((char)(c+32));
            }
            if(c>=97 && c<=123){
                sb.append(c);
            }
        }
        s=sb.toString();
        int left=0;
        int right=s.length()-1;
        while(left<=right){
            if(s.charAt(left)==s.charAt(right)){
                left++;
                right--;
            }else{
                return false;
            }
        }
        return true;
    }
}
