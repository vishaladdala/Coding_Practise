/*
66. Plus One
DescriptionHintsSubmissionsDiscussSolution
Given a non-negative integer represented as a non-empty array of digits, plus one to the integer.

You may assume the integer do not contain any leading zero, except the number 0 itself.

The digits are stored such that the most significant digit is at the head of the list.
*/

class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        
        for(int i = len-1; i>=0; i--){
            if(digits[i] < 9){
                digits[i] += 1;
                return digits;
            }
            else{
                digits[i] = 0;
            }
        }
        
        int[] extra = new int[len+1];
        extra[0] = 1;
        
        return extra;
    }
}