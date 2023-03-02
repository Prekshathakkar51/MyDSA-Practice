class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        // we take target array as the length of the index 
        int[] target = new int[index.length];
        
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i< nums.length; i++){
            list.add(index[i],nums[i]);
        }

        for(int i = 0; i < list.size(); i++){
            target[i] = list.get(i);
        }


        return target;

        
    }
}
