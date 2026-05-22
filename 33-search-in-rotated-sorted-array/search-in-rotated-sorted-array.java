class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while(left < right) {
            int mid = left + (right - left) / 2;
            if(nums[mid] > nums[right]) {
                left = mid + 1;
            } 
            else {
                right = mid;
            }
        }
        int pivotIndex = left;
        if(target >= nums[pivotIndex] && target <= nums[nums.length - 1]) {
            left = pivotIndex;
            right = nums.length - 1;
        } 
        else {
            left = 0;
            right = pivotIndex - 1;
        }
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(nums[mid] == target) {
                return mid;
            }
            if(nums[mid] > target) {
                right = mid - 1;
            } 
            else {
                left = mid + 1;
            }
        }
        return -1;
    }
}