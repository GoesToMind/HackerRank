package com.vitor.hr0002;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void sampleInput0() {

        int[] socks = new int[]{10, 20, 20, 10, 10, 30, 50, 10, 20};

        int pairs = Solution.sockMerchant(socks);

        assertEquals(3, pairs);

    }


}