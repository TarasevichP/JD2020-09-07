package by.it.hryntsaliou.jd01_04;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

class TaskA {
    public static void main(String[] args) {
        printMulTable();
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        buildOneDimArray(line);
    }


    static void printMulTable() {
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%1d*%1d=%-3d", i, j, i * j);
            }
            System.out.println();
        }
    }

    static void buildOneDimArray(String line) {
        double[] array = InOut.getArray(line);
        InOut.printArray(array, "V", 5);
        double first = array[0];
        double last = array[array.length - 1];
        Helper.sort(array);
        InOut.printArray(array, "V", 4);
        int indexFirst = Arrays.binarySearch(array, first);
        int indexLast = Arrays.binarySearch(array, last);
        System.out.printf("Index of first element=%d \n", indexFirst);
        System.out.printf("Index of last element=%d \n", indexLast);
    }

}
