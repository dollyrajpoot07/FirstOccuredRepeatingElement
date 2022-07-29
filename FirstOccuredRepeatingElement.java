// Given an array array[] of size N. The task is to find the first repeating element index in the array of the integers, i.e., 
//an element that occurs more than once and whose index of first occurence is smallest.
//Input:
// 7
// 10 5 3 4 3 5 6
// Output:
// 2

import java.util.*;

public class FirstOccuredRepeatingElement {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        final int N = (int) (1e6 + 2);
        int[] index = new int[N];
        for(int i = 0; i < N; i++) {
            index[i] = -1;
        }

        int minimumIndex = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++) {
            if(index[array[i]] != -1) {
                minimumIndex = Math.min(minimumIndex, index[array[i]]);
            } else {
                index[array[i]] = i;
            }
        }
        if(minimumIndex == Integer.MAX_VALUE) {
            System.out.println("-1");
        } else {
            System.out.println("At place: " + (minimumIndex + 1));
            System.out.println();
        }
        sc.close();
    }
}