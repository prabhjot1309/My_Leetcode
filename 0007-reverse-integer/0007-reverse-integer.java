class Solution {
    public int reverse(int x) {
        int revNo= 0;
        while(x!=0){
            int lastDigit=x%10;
            if(revNo>Integer.MAX_VALUE/10 || revNo< Integer.MIN_VALUE/10){
                return 0;
            }
            x= x/10;
            revNo= (revNo*10)+ lastDigit;
        }
        return revNo;
        
    }
}