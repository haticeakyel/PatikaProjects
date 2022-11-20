package com.company;

public class Main {

    public static void main(String[] args) {
        int[][] matris= {{1,2,3},{4,5,6}};
        int[][] transpose=new int[matris[0].length][matris.length];

        System.out.println("Your matrix:");
        System.out.println();
        for(int i=0;i<matris.length;i++) {
            for(int j=0;j<matris[0].length;j++) {
                System.out.print(matris[i][j]+" ");
            }
            System.out.println();
        }


        for(int i=0;i<matris.length;i++) {
            for(int j=0;j<matris[0].length;j++) {
                transpose[j][i]=matris[i][j];
            }

        }
        System.out.println("Transpoze:");
        System.out.println();
        for(int i=0;i<transpose.length;i++) {
            for(int j=0;j<transpose[0].length;j++) {
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }

    }

}
