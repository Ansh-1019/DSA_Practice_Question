class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
       for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int maxFrequency = 0;
        int majority = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                majority = entry.getKey();
            }
        }

        return majority;

        }
}