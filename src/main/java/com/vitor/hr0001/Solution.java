package com.vitor.hr0001;

public class Solution {

    public static int jumpingOnClouds(int[] clouds) {

        int jumps = 0;
        int size = clouds.length;

        for(int i = 0; i < size - 1; i++){
            if ((i + 2 < size) && (clouds[i + 2] == 0)){
                i++;
            }
            jumps++;
        }

        return jumps;
    }

}
