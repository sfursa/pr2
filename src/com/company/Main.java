package com.company;

import java.net.SocketOption;
import java.net.SocketTimeoutException;

public class Main {

    public static void main(String[] args) {

        int b = 0;
        int[] a = new int[10];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;
        a[5] = 6;
        a[6] = 7;
        a[7] = 8;
        a[8] = 9;
        a[9] = 10;
        while (b < a.length) {
            System.out.print(b + " ");
            b++;
        }
        System.out.println();

        int[][] c = {{0, 1, 2, 3},
                    {4, 5, 6, 7}};
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
        for(int i=0; i<4; i++){
            for(int j=0; j<2; j++){
                System.out.print(c[j][i]+" ");
            }
            System.out.println();
        }


    }
}
