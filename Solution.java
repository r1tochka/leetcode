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

//комментарий мог бы быть по делу, но он просто для того, чтобы были изменения в новой веточке)