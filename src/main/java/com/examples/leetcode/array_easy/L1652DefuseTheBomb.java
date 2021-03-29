package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/defuse-the-bomb/ */
public class L1652DefuseTheBomb {

    public int[] decrypt(int[] code, int k) {
        int[] ret = new int[code.length];
        int tmp = 0;
        if (k > 0) {
            for (int i = 0; i < k; ++i) {
                tmp += code[i];
            }
            for (int i = 0; i < code.length; ++i) {
                int index = i + k;
                if (index >= code.length) {
                    index -= code.length;
                }
                tmp = tmp - code[i] + code[index];
                ret[i] = tmp;
            }
        } else if (k < 0) {
            for (int i = code.length - 1; i >= code.length + k; --i) {
                tmp += code[i];
            }
            for (int i = code.length - 1; i >= 0; --i) {
                int index = i + k;
                if (index < 0) {
                    index += code.length;
                }
                tmp = tmp - code[i] + code[index];
                ret[i] = tmp;
            }
        }
        return ret;
    }
}
