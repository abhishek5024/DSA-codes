class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> nums3 = new HashSet();
        Set<Integer> res = new HashSet();

    

        for (int i = 0; i<nums1.length; i++){
            nums3.add(nums1[i]);
        }

        for (int j = 0;j<nums2.length;j++){
            if(nums3.contains(nums2[j])){            
                res.add(nums2[j]);
     }        }
    int[] ans = new int[res.size()];     
    int i =0;
     for (int n : res){
        ans[i++] = n;
     }
     return ans;
    }
}
