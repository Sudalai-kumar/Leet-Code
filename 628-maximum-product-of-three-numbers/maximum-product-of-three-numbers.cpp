class Solution {
public:
    int maximumProduct(vector<int>& nums) {
        int n = nums.size();
        sort(nums.begin(), nums.end());
        int maxProduct = INT_MIN;
        int i = n - 3, j = n - 1;
        for (int count = 0; count < 4; count++) {
            int product = 1;
            for (int start = i; start <= j; start++) {
                product *= nums[start % n];
            }
            maxProduct = max(maxProduct, product);
            i++;
            j++;
        }
        return maxProduct;
    }
};