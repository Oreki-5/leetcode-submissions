class Solution {
    public int smallestNumber(int n, int t) {
        int min = Integer.MAX_VALUE;
        boolean flag = true;

        while (true) {
            if (productOfDigits(n) % t == 0) {
                return n;
            } else {
                n++;
            }
        }

    }

    public int productOfDigits(int n) {

        int product = 1;

        while (n != 0) {
            product *= (n % 10);
            n /= 10;
        }

        return product;
    }
}