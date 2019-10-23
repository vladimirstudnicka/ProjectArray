package sk.itsovy.studnicka.array;

import java.util.Random;

public class MyArray {

    public static void test1() {
        int[] arr = new int[7];
        int i;
        for (i = 0; i <= 6; i++)
            arr[i] = i - 3;
        for (i = 6; i >= 0; i--)
            System.out.print(arr[i] + " ");
    }

    public static void test2() { //10x 2.cif random cislo vypisane aj od predu aj od zadu
        Random rd = new Random();

        int[] arr = new int[10];
        int i;
        for (i = 0; i <= 9; i++)
            arr[i] = rd.nextInt(90) + 10;

        i = 0;
        while (i < 10) {
            System.out.print(arr[i] + " ");
            i++;
        }
        System.out.println();
        i = 9;
        do {
            System.out.print(arr[i] + " ");
            i--;
        } while (i>=0);

        System.out.println();
        for (i=0;i<10;i++)
            if (arr[i]%2==0)
                System.out.print(arr[i]+" ");
    }

    public static void test2For() {
        System.out.println();

        Random rd = new Random();
        int[] arr = new int[10];

        for (int i = 0; i <= 9; i++) {
            arr[i] = rd.nextInt(90) + 10;
        }
        for (int i = 0; i <= 9; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for (int i = 9; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
