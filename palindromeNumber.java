class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        int sum = x;
        int reversedSum = 0;
        while(x>0){
            reversedSum = ((reversedSum * 10) + x % 10) ;
            x /= 10;
        }
        return sum == reversedSum;
    }
}
