class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n= candies.length;
        int maximum= candies[0];
        
        for (int i=0; i<n; i++){
            if(candies[i]> maximum){
                maximum= candies[i];
            }
        }
     List<Boolean> answer = new ArrayList<>();

        // Check each child
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= maximum) {
                answer.add(true);
            } else {
                answer.add(false);
            }
        }

        return answer;

        
    }
}