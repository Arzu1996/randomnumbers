package classwork;

import java.util.Random;
import java.util.Arrays;

public class classwork {
    public static void main(String[] args) {

        int[] a= new int[20];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random()*20-10);
        }
        System.out.println(Arrays.toString(a));
     int[] b = new int[20];

        for (int i =0; i<a.length; i++) {
            int src_pos=i;
            int dst_pos =20-i-1;
            b[dst_pos] = a[src_pos];
        }
        System.out.println(Arrays.toString(b));






    }

}
