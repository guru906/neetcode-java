package Day05_Arrays;

import java.util.*;

public class unionTwoPointer {
    public static void main(String args[]) {
        int arr1[] = {1, 2, 3, 4, 5, 6};
        int arr2[] = {2, 4, 5, 6, 7, 8, 9};

        ArrayList<Integer> union1 = union(arr1, arr2);
        System.out.println(union1);
    }

    public static ArrayList<Integer> union(int[] a, int[] b) {
        ArrayList<Integer> union = new ArrayList<>();

        int i = 0, j = 0;

        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                if (union.size() == 0 || union.get(union.size() - 1) != a[i]) {
                    union.add(a[i]);
                }
                i++;
            } else {
                if (union.size() == 0 || union.get(union.size() - 1) != b[j]) {
                    union.add(b[j]);
                }
                j++;
            }
        }

        // remaining elements of a[]
        while (i < a.length) {

            if (union.size() == 0 || union.get(union.size() - 1) != a[i]) {
                union.add(a[i]);
            }
            i++;
        }

        // remaining elements of b[]
        while (j < b.length) {
            if (union.size() == 0 || union.get(union.size() - 1) != b[j]) {
                union.add(b[j]);
            }
            j++;
        }

        return union;
    }
}