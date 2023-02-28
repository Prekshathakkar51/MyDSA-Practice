class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
// declaring a new list of type boolean that we have to return
        List<Boolean> ans = new ArrayList<>();
        // declaringa new array temp, which will clone the candies array and it will be sorted in the ascending order so that we get the largest of all at the last index of the array, hence when we compare each element with the last element while comparing after adding the extra candies.
        int[] temp = new int[candies.length];
        temp = candies.clone();
        Arrays.sort(temp);

        for(int i = 0; i<candies.length; i++){
            if(candies[i]+extraCandies >= temp[candies.length-1]){
                ans.add(true);
            }
            else{
                ans.add(false);
            }
        }
        return ans;

    }
}