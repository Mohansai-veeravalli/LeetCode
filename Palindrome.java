class Solution {
    public boolean isPalindrome(int x) {
        int rev=0,r=0;
        int num=x;

        while(num>0){
            r = num % 10;
            rev = rev*10+r;
            num = num/10;
        }
        if(rev==x){
            return true;
        }
        else{
            return false;
        }
    }
}
