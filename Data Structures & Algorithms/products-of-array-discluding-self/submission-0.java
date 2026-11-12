class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        int prod1 = 1;
        int prod2 = 1;

        for(int i = 0; i < n; i++){
            arr1[i] = prod1;
            arr2[n - i - 1] = prod2;

            prod1 *= nums[i];
            prod2 *= nums[n - i - 1];
        }

        for(int i = 0; i < n; i++){
            nums[i] = arr1[i] * arr2[i];
        }

        return nums;
    }
}  
