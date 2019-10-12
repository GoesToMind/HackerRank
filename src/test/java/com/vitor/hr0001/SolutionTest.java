package com.vitor.hr0001;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void sampleInput0() {

        int[] clouds = new int[]{0, 0, 1, 0, 0, 1, 0};

        int jumps = Solution.jumpingOnClouds(clouds);

        assertEquals(4, jumps);

    }

    @Test
    void sampleInput1() {

        int[] clouds = new int[]{0, 0, 0, 0, 1, 0};

        int jumps = Solution.jumpingOnClouds(clouds);

        assertEquals(3, jumps);

    }
}