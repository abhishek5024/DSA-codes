class Solution {
public:
    int majorityElement(vector<int>& nums) {
        // int count =0;
         int n =nums.size();
        // for(int i=0;i<n;i++){
        //     int count =0;
        //     for(int j=0;j<n;j++){
        //         if(nums[i]==nums[j]){
        //             count++;
        //         }
        //         if(count>n/2) return nums[i];
        //     }
        // }
        // return 0;

      //using map

        map<int,int>mpp;
        for(int i=0;i<n;i++){
            mpp[nums[i]]++;
        }

        for(auto it:mpp){
            if(it.second>n/2){
            return it.first;
            }
        }
        return -1;
    }
};
