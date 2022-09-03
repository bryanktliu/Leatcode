package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/minimum-hours-of-training-to-win-a-competition/ */
public class L2383MinimumHoursOfTrainingToWinACompetition {

    public int minNumberOfHours(
            int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        int minEnergy = 1;
        for (int e : energy) {
            minEnergy += e;
        }
        int difExperience = 0;
        int currentExperience = initialExperience;
        for (int exp : experience) {
            if (currentExperience <= exp) {
                difExperience += exp + 1 - currentExperience;
                currentExperience = exp + 1;
            }
            currentExperience += exp;
        }
        return difExperience + Math.max(0, minEnergy - initialEnergy);
    }
}
