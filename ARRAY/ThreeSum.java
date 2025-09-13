import java.util.*;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums); // 1. Sort the array (needed for two-pointer approach)
        List<List<Integer>> res = new ArrayList<>(); // 2. Result list to store triplets

        for (int i = 0; i < nums.length - 2; i++) { // 3. Loop for first element of triplet
            if (i > 0 && nums[i] == nums[i - 1]) { // 4. Skip duplicates for i
                continue;
            }

            int l = i + 1;               // 5. Left pointer (just after i)
            int r = nums.length - 1;     // 6. Right pointer (end of array)

            while (l < r) {              // 7. Keep going until pointers cross
                int sum = nums[i] + nums[l] + nums[r]; // 8. Calculate sum of triplet

                if (sum == 0) {          // 9. Found a valid triplet
                    res.add(Arrays.asList(nums[i], nums[l], nums[r]));

                    // 10. Skip duplicates for left pointer
                    while (l < r && nums[l] == nums[l + 1]) l++;
                    // 11. Skip duplicates for right pointer
                    while (l < r && nums[r] == nums[r - 1]) r--;

                    l++; // 12. Move left pointer inward
                    r--; // 13. Move right pointer inward
                } 
                else if (sum < 0) { // 14. Sum too small → move left forward to increase
                    l++;
                } 
                else {              // 15. Sum too big → move right backward to decrease
                    r--;
                }
            }
        }
        return res; // 16. Return all unique triplets
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(nums));
    }
}
