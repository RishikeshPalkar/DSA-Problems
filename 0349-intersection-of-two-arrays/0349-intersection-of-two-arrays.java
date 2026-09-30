class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet();
        for(int num : nums1){
            set.add(num);
        }

        List<Integer> res = new ArrayList();
        for(int num : nums2){
            if(set.contains(num)){
                res.add(num);
                set.remove(num);
            }
        }
        int n = res.size();
        int result [] = new int[n];
        for(int i= 0 ; i<n ; i++){
            result[i] = res.get(i);
        }

        return result;
    }
}