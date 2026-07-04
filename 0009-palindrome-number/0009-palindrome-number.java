class Solution {
    public boolean isPalindrome(int x) {
        int dul= x;
        int revNo=0;
        while(x>0){
            int lastDigit=x%10;
            x= x/10;
            revNo= (revNo*10)+ lastDigit;
        }
        if(revNo== dul){
            return true;
        }
        else{
            return false;
        }
        
    }
}