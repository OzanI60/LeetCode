class Solution {
    public int[] plusOne(int[] digits) {
        int res = 0;
        for(int i=0,exp=digits.length-1;i<digits.length;i++,exp--) {
            res+=digits[i]*Math.pow(10, exp);
        }
        res += 1;
        String temp = Integer.toString(res);
        int[] digits2 = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++)
        {
            digits2[i] = temp.charAt(i) - '0';
        }
        return digits2;
    }
}