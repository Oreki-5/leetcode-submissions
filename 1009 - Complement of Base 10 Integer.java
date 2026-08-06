class Solution {
    public int bitwiseComplement(int n) {

        String binary = Integer.toBinaryString(n);
        char[] arr = binary.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '0') {
                arr[i] = '1';
            } else {
                arr[i] = '0';
            }
        }
        return Integer.parseInt(String.valueOf(arr), 2);

    }
}