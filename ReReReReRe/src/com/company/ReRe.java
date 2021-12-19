package com.company;

public class ReRe {
    static void re(int i, int k) {
        if (i > k) {
            return;
        }
        for (int x = 0; x < i; x++) {
            System.out.print(i + ", ");
        }
        re(i+1, k);
    }



    public static void main(String[] args) {
        re(1, 4);
    }
}