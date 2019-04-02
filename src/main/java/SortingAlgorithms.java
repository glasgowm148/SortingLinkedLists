import java.io.*;
import java.util.stream.IntStream;

abstract class SortingAlgorithms {


    static int[] generateA(int size) {
        int[] A = new int[size];
        int AElement;

        for (int i = 0; i < A.length; i++) {
            AElement = (int) (Math.random() * 100);
            A[i] = AElement;
        }
        return A;
    }


    static void swap(int[] A, int p, int r) {
        int temp = A[p];
        A[p] = A[r];
        A[r] = temp;
    }

    static class TimeSortingAlgorithms {



        static int[] readFiles(String filename) throws IOException {
            File file = new File(filename);

            byte[] bytes = new byte[(int) file.length()];

            try(InputStream fileIn = new FileInputStream( file )) {
               fileIn.readNBytes( bytes, 0, (int) file.length() ); // unlike just 'read', this does guarantee
            }


            String[] valueStr = new String(bytes).trim().split("\\s+");
            int[] array = new int[valueStr.length];
            for (int i = 0; i < valueStr.length; i++)
                array[i] = Integer.parseInt(valueStr[i]);
            return array;
        }


        static long timerInsert(int[] A) {
            long nano_startTime = System.nanoTime();
            InsertionSort.insertionSort( A );
            long nano_endTime = System.nanoTime();
            return nano_endTime - nano_startTime;
        }

        static long timerQuick(int[] A) {
            long nano_startTime = System.nanoTime();
            QuickSort.quickSort( A, 0, A.length - 1 );
            long nano_endTime = System.nanoTime();
            return nano_endTime - nano_startTime;
        }

        static long timerQuickCutOff(int[] A) {
            long nano_startTime = System.nanoTime();
            QuickSort.quickSortCutOff( A, A.length - 1, 5 );
            long nano_endTime = System.nanoTime();
            return nano_endTime - nano_startTime;
        }

        static long timerQuickMedian(int[] A) {
            long nano_startTime = System.nanoTime();
            QuickSort.quickSortMedian( A, 0, A.length - 1 );
            long nano_endTime = System.nanoTime();
            return nano_endTime - nano_startTime;
        }

        static long timerThreeWay(int[] A) {
            long nano_startTime = System.nanoTime();
            QuickSort.quickSort( A, 0, A.length - 1 );
            long nano_endTime = System.nanoTime();
            return nano_endTime - nano_startTime;
        }

        static boolean testSortingAlgorithm(int A[]) {
            return IntStream.range( 0, A.length - 1 ).anyMatch( i -> A[i] > A[i + 1] ); //

        }


    }
}




