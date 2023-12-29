package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/count-tested-devices-after-test-operations/ */
public class L2960CountTestedDevicesAfterTestOperations {

    public int countTestedDevices(int[] batteryPercentages) {
        int tested = 0;
        for (int batteryPercentage : batteryPercentages) {
            if (batteryPercentage > tested) {
                ++tested;
            }
        }
        return tested;
    }
}
