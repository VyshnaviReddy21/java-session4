import java.util.Arrays;

public class Day10_session { // Class name corrected to "Main" (standard naming convention)
    public static void main(String[] args) {
        int[] nums1 = {1, 9, 20, 40}; // First sorted array
        int m = 4; // Number of elements in nums1
        int[] nums2 = {2, 10, 30}; // Second sorted array
        int n = 3; // Number of elements in nums2

        // Call the mergeArrays method and store the result
        int[] mergedArray = mergeArrays(nums1, m, nums2, n);

        // Print the merged array
        System.out.println("Merged Array: " + Arrays.toString(mergedArray));
    }

    // Method to merge two sorted arrays
    public static int[] mergeArrays(int[] nums1, int m, int[] nums2, int n) {
        int[] arr = new int[m + n]; // Array to store the merged result
        int idx = 0; // Index for the merged array

        int p1 = 0; // Pointer for nums1
        int p2 = 0; // Pointer for nums2

        // Merge the arrays while there are elements in both
        while (p1 < m && p2 < n) {
            if (nums1[p1] < nums2[p2]) {
                arr[idx] = nums1[p1];
                p1++;
            } else {
                arr[idx] = nums2[p2];
                p2++;
            }
            idx++;
        }

        // Add remaining elements from nums1, if any
        while (p1 < m) {
            arr[idx] = nums1[p1];
            p1++;
            idx++;
        }

        // Add remaining elements from nums2, if any
        while (p2 < n) {
            arr[idx] = nums2[p2];
            p2++;
            idx++;
        }

        return arr; // Return the merged array
    }
}

