package examples.lezione2025_03_06;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void showArray(String[] array) {
        for (String s : array) {
            System.out.println(s);
        }
    }

    public static int[]  copyArray(int[] src) {
        int[] dst = new int[src.length];
        for(int i = 0; i < src.length; i++) {
            dst[i] = src[i];
        }
        return dst;
    }

    public static void main(String[] args) {
        double[] a = new double[5];
        /*
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;
         */
        //System.out.println(a[0]);
        for (int i = 0; i < a.length; i++) {
           a[i] = Math.random();
        }
        for (double i : a) {
            System.out.println(i);
        }

        String[] s = new String[5];
        s[0] = "Hello";
        s[1] = "World";
        s[2] = "!";
        showArray(s);
        showArray(new String[]{"Ciao", "!"});

        int[] b = {1,2,3,4,5,77,88,101};
        System.out.println(Arrays.binarySearch(b, 3));
    }
}
