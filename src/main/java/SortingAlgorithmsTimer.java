import java.util.*;
import java.io.*;
import java.time.*;

class SortingAlgorithmsTimer {

    public static int[] readFiles(File file, int size) throws FileNotFoundException {
        int[] result = new int[size];
        try (Scanner s = new Scanner(new FileReader(file))) {
            int i = 0;
            while (s.hasNext()) {
                result[i] = Integer.parseInt(s.nextLine());
                i++;
            }
            return result;
        }
    }

    public static long timerSelect(int[] arr){

        long nano_startTime = System.nanoTime();
        SelectionSort.selectionSort(arr);
        long nano_endTime = System.nanoTime();

        return nano_endTime - nano_startTime;
    }

    public static long timerInsert(int[] arr){
        long nano_startTime = System.nanoTime();
        InsertionSort.insertionSort(arr);
        long nano_endTime = System.nanoTime();
        return nano_endTime - nano_startTime;
    }



}




