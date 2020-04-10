import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

//        A left rotation operation on an array of size  shifts each of the array's elements  unit to the left. For example, if  left rotations are performed on array , then the array would become .
//        Given an array of  integers and a number, , perform  left rotations on the array. Then print the updated array as a single line of space-separated integers.

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");


        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        scanner.close();
        Solution leftRotation = new Solution();

        for (int j = 0; j < d; j++){
            leftRotation.leftRotatebyOne(a, n);
        }

        for (int k = 0; k < n; k++){
            System.out.print(a[k] + " ");
        }

    }
    public static void leftRotatebyOne(int array[], int n)
    {
        int i, temp;
        temp = array[0];
        for (i = 0; i < n - 1; i++)
            array[i] = array[i + 1];
        array[i] = temp;
    }
}
