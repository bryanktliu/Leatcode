package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/majority-element/ */
public class L169MajorityElement {

    public int majorityElement(int[] nums) {
        return kthSmallest(nums, 0, nums.length - 1, nums.length / 2 + 1);
    }

    private int kthSmallest(int[] arr, int l, int r, int k) {
        // If k is smaller than number of elements in array
        if (k > 0 && k <= r - l + 1) {
            // Divide arr[] in groups of size 5, calculate median of every group and store it in
            // median[] array.
            // Partition the array around a random element and
            // get position of pivot element in sorted array
            int pos = standPartition(arr, l, r);

            // If position is same as k
            if (pos - l == k - 1) {
                return arr[pos];
            }
            if (pos - l > k - 1) {
                // If position is more, recur for left
                return kthSmallest(arr, l, pos - 1, k);
            }

            // Else recur for right subarray
            return kthSmallest(arr, pos + 1, r, k - pos + l - 1);
        }
        // If k is more than number of elements in array
        return Integer.MAX_VALUE;
    }

    private int standPartition(int[] arr, int l, int r) {
        int x = arr[r];
        int i = l;
        for (int j = l; j <= r - 1; ++j) {
            if (arr[j] <= x) {
                swap(arr, i, j);
                i++;
            }
        }

        swap(arr, i, r);
        return i;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
