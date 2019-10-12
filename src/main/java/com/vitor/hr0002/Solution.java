package com.vitor.hr0002;

public class Solution {

    static int sockMerchant(int socks[]) {

        int pair = 0;

        for (int i = 0; i < socks.length; i++) {

            for (int j = i + 1; j < socks.length; j++) {
                if ((-1 != socks[i]) && (-1 != socks[j]) && (socks[i] == socks[j])) {
                    pair++;
                    socks[j] = -1;
                    socks[i] = -1;
                    break;
                }
            }
        }

        return pair;

    }
}
