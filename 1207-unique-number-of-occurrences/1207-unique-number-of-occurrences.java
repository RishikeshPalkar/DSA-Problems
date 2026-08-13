class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer , Integer> map = new HashMap();
        Set<Integer> uniqueSet = new HashSet<>();
        for(int num : arr){
            map.put(num , map.getOrDefault(num , 0) +1);
        }
        for (int frequency : map.values()) {
            if (!uniqueSet.add(frequency)) {
                return false;
            }
        }

        return true;
    }
}