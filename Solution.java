import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> seenValues = new HashSet<>();
        for (int i = 0; i < nums.length; i++){
            if (seenValues.contains(nums[i])){
                return true;

            }
            seenValues.add(nums[i]);
        }

        return false;

    }

}