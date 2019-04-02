import java.util.stream.IntStream;


class SelectionSort {
    public static int[] selectionSort(int array[]) {
        for ( int i=0; i<array.length-1; i++){

            int smallest = i;

            for ( int j=i+1; j < array.length; j++) {

                if ( array[j] < array[smallest] ) { smallest = j; }
            }

            int temp = array[smallest];
            array[smallest] = array[i];
            array[i] = temp;

        }
        return array;
    }

    public static boolean TestSortingAlgorithm(int array[]) {
        return IntStream.range(0, array.length - 1).anyMatch(i -> array[i] > array[i + 1]);

    }



}