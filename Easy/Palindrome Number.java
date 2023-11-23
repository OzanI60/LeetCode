class Solution {
    public boolean isPalindrome(int x) {
        String temp = Integer.toString(x);
        char ch;
        String nstr = "";
        for (int i=0; i<temp.length(); i++) {
            ch= temp.charAt(i);
            nstr = ch+nstr;
        }
        return nstr.equals(temp);
    }

}