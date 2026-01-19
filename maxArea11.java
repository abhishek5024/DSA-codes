class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int area=0;
        int maxwater = 0;


        while (left < right){
            int width = right - left;
            int height1 = Math.min(height[left], height[right]);

            area = width*height1;
            maxwater = Math.max(area, maxwater);
            if (height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxwater;
    }
}
