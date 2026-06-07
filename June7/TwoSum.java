class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int com = target-nums[i];
            if(map.containsKey(com)){
                return new int[] {map.get(com),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }
}

// Store number -> index in HashMap
// For each number, find its complement (target - nums[i])
// If complement already exists, return both indices
// Otherwise store current number and index

// Time Complexity: O(n)
// Space Complexity: O(n)
