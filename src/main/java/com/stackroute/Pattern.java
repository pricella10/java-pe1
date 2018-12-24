package com.stackroute;


public class Pattern
{
    public int Pattern(int n) {
        int i;
        for (i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                return j;
            }
        }
        return i;
    }
}