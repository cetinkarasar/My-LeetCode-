class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        for(int nums:nums1){
        set1.add(nums);
        }
       
        HashSet<Integer> set2 = new HashSet<>();
        for(int num2: nums2){
        set2.add(num2);
        }

        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();

        for(int num:set1){
            if(!set2.contains(num)){
                l1.add(num);
            }
            }
        for(int num2:set2){
            if(!set1.contains(num2)){
                l2.add(num2);
            }
        }
        answer.add(l1);
        answer.add(l2);

        return answer;
        
    }
}