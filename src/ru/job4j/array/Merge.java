package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int count = 0;
        int countLeft = 0;
        int countRight = 0;
        //for (; countLeft < left.length;) {
        //    for (; countRight < right.length;) {
        //        if (left[countLeft] < right[countRight]) {
        //            rsl[count] = left[countLeft];
        //            countLeft++;
        //            count++;
        //        } else if (left[countLeft] > right[countRight]) {
        //            rsl[count] = right[countRight];
        //            countRight++;
        //            count++;
        //        } else {
        //            rsl[count] = left[countLeft];
        //            rsl[count + 1] = right[countLeft];
        //            countLeft++;
        //            countRight++;
        //            count += 2;
        //        }
        //    }
        //}

        while (countLeft + countRight < left.length + right.length) {
                if (left[countLeft] < right[countRight] && countLeft < left.length) {
                    rsl[count] = left[countLeft];
                    countLeft++;
                    count++;
                } else if (left[countLeft] > right[countRight] && countRight < right.length) {
                    rsl[count] = right[countRight];
                    countRight++;
                    count++;
                } else {
                    rsl[count] = left[countLeft];
                    rsl[count + 1] = right[countLeft];
                    countLeft++;
                    countRight++;
                    count += 2;
                }

        }

        return rsl;
    }
}
