class Solution {
    public boolean isPalindrome(int x) { //aryav
        int orignal = x;
        int digit = 0;
        while(x>0){
            int a = x%10;
            digit = digit * 10+a;
            x=x/10;
        }
        if(orignal==digit){
            return true;
        }
        else {
            return false;
        }
    }
}