//You have been given an array from which except first & last index you have to copy the elements to new array & print it

import java.util.Arrays;
import java.util.Scanner;

public class middleFunction {

    public static int[] middle(int[] arr) {
        int[] newArr;
        newArr = new int[arr.length - 2];
        for (int i = 1; i < arr.length - 1; i++) {
            newArr[i - 1] = arr[i];

        }
        // write your code here

        return newArr;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt(); // enter array size
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int[] newArr = middle(arr);
        System.out.println(Arrays.toString(newArr));

        sc.close();
    }
}