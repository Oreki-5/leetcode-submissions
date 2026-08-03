
class Solution {
    public boolean isPalindrome(int x) {
        
        String num = Integer.toString(x);

        String reverse = new StringBuilder(num).reverse().toString();
        

        return num.equals(reverse);
    }
}