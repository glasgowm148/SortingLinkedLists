import java.io.IOException;
import java.util.Arrays;

class Main {

    public static void main(String[] args) throws IOException {


        // 1a
        //int[] A = SortingAlgorithms.generateA( 10 );
        int[] A = {6, 5, 4, 3, 2, 1};
        System.out.println( "Array A : " + Arrays.toString( A ) );
        QuickSort.quickSort( A, 0, A.length - 1 );
        System.out.println( "Array A after quickSort : " + Arrays.toString( A ) );
        System.out.println("Ordered Correctly? : " + !SortingAlgorithms.TimeSortingAlgorithms.testSortingAlgorithm( A ) + "\n");

        // 1b
        int[] B = SortingAlgorithms.generateA( 5 );
        System.out.println( "Array B : " + Arrays.toString( B ) );
        QuickSort.quickSortCutOff( B, B.length - 1, 9 );
        InsertionSort.insertionSort( B );
        System.out.println( "Array B after insertionSort : " + Arrays.toString( B ) );
        System.out.println("Ordered Correctly? : " + !SortingAlgorithms.TimeSortingAlgorithms.testSortingAlgorithm( B ) + "\n");


        // 1c
        int[] C = SortingAlgorithms.generateA( 4 );
        System.out.println( "Array C : " + Arrays.toString( C ) );
        QuickSort.quickSortMedian( C, 0, C.length - 1 );
        System.out.println( "Array C after Median Sort : " + Arrays.toString( C ) );
        System.out.println("Ordered Correctly? : " + !SortingAlgorithms.TimeSortingAlgorithms.testSortingAlgorithm( C  ) + "\n");


        // 1d
        //int []D = SortingAlgorithms.generateArray(4);
        //System.out.println("Array D : " + Arrays.toString(D));
        int[] D = {6, 5, 4, 3, 2, 1};
        QuickSort.threeWaySort( D, D.length - 1 );
        System.out.println( "Array D after threeWayQuickSort : " + Arrays.toString( D ) );
        System.out.println("Ordered Correctly? : " + !SortingAlgorithms.TimeSortingAlgorithms.testSortingAlgorithm( D ) + "\n");



        // 10
        System.out.println( "---------------------------------" );
        System.out.println( "Time taken to sort int10.txt:" );
        int[] result = SortingAlgorithms.TimeSortingAlgorithms.readFiles( "int10.txt" );

        System.out.println( "Insertion Sort: " + SortingAlgorithms.TimeSortingAlgorithms.timerInsert( result ) + " Nanoseconds" );
        System.out.println( "Quick Sort: " + SortingAlgorithms.TimeSortingAlgorithms.timerQuick( result ) + " Nanoseconds" );
        System.out.println( "Quick Sort Cut-off: " + SortingAlgorithms.TimeSortingAlgorithms.timerQuickCutOff( result ) + " Nanoseconds" );
        System.out.println( "Quick Sort Median: " + SortingAlgorithms.TimeSortingAlgorithms.timerQuickMedian( result ) + " Nanoseconds" );
        System.out.println( "Three-way Quick Sort: " + SortingAlgorithms.TimeSortingAlgorithms.timerThreeWay( result ) + " Nanoseconds" );

        // 50
        System.out.println( "---------------------------------" );
        System.out.println( "Time taken to sort int50.txt:" );
        result = SortingAlgorithms.TimeSortingAlgorithms.readFiles( "int50.txt" );
        System.out.println( "Insertion Sort: " + SortingAlgorithms.TimeSortingAlgorithms.timerInsert( result ) + " Nanoseconds" );
        System.out.println( "Quick Sort: " + SortingAlgorithms.TimeSortingAlgorithms.timerQuick( result ) + " Nanoseconds" );
        System.out.println( "Quick Sort Cut-off: " + SortingAlgorithms.TimeSortingAlgorithms.timerQuickCutOff( result ) + " Nanoseconds" );
        System.out.println( "Quick Sort Median: " + SortingAlgorithms.TimeSortingAlgorithms.timerQuickMedian( result ) + " Nanoseconds" );
        System.out.println( "Three-way Quick Sort: " + SortingAlgorithms.TimeSortingAlgorithms.timerThreeWay( result ) + " Nanoseconds" );

        // 100
        System.out.println( "---------------------------------" );
        System.out.println( "Time taken to sort int100.txt:" );
        result = SortingAlgorithms.TimeSortingAlgorithms.readFiles( "int100.txt" );
        System.out.println( "Insertion Sort: " + SortingAlgorithms.TimeSortingAlgorithms.timerInsert( result ) + " Nanoseconds" );
        System.out.println( "Quick Sort: " + SortingAlgorithms.TimeSortingAlgorithms.timerQuick( result ) + " Nanoseconds" );
        System.out.println( "Quick Sort Cut-off: " + SortingAlgorithms.TimeSortingAlgorithms.timerQuickCutOff( result ) + " Nanoseconds" );
        System.out.println( "Quick Sort Median: " + SortingAlgorithms.TimeSortingAlgorithms.timerQuickMedian( result ) + " Nanoseconds" );
        System.out.println( "Three-way Quick Sort: " + SortingAlgorithms.TimeSortingAlgorithms.timerThreeWay( result ) + " Nanoseconds" );

        // 1000
        System.out.println( "---------------------------------" );
        System.out.println( "Time taken to sort int1000.txt:" );
        result = SortingAlgorithms.TimeSortingAlgorithms.readFiles( "int1000.txt" );
        System.out.println( "Insertion Sort: " + SortingAlgorithms.TimeSortingAlgorithms.timerInsert( result ) + " Nanoseconds" );
        System.out.println( "Quick Sort: " + SortingAlgorithms.TimeSortingAlgorithms.timerQuick( result ) + " Nanoseconds" );
        System.out.println( "Quick Sort Cut-off: " + SortingAlgorithms.TimeSortingAlgorithms.timerQuickCutOff( result ) + " Nanoseconds" );
        System.out.println( "Quick Sort Median: " + SortingAlgorithms.TimeSortingAlgorithms.timerQuickMedian( result ) + " Nanoseconds" );
        System.out.println( "Three-way Quick Sort: " + SortingAlgorithms.TimeSortingAlgorithms.timerThreeWay( result ) + " Nanoseconds" );


        // 500k
        System.out.println( "---------------------------------" );
        System.out.println( "Time taken to sort int500k.txt:" );
        result = SortingAlgorithms.TimeSortingAlgorithms.readFiles( "int500k.txt" );
        System.out.println( "Insertion Sort: " + SortingAlgorithms.TimeSortingAlgorithms.timerInsert( result ) + " Nanoseconds" );
        System.out.println( "Quick Sort: " + SortingAlgorithms.TimeSortingAlgorithms.timerQuick( result ) + " Nanoseconds" );
        System.out.println( "Quick Sort Cut-off: " + SortingAlgorithms.TimeSortingAlgorithms.timerQuickCutOff( result ) + " Nanoseconds" );
        System.out.println( "Quick Sort Median: " + SortingAlgorithms.TimeSortingAlgorithms.timerQuickMedian( result ) + " Nanoseconds" );
        System.out.println( "Three-way Quick Sort: " + SortingAlgorithms.TimeSortingAlgorithms.timerThreeWay( result ) + " Nanoseconds" );



        // Dutch
        System.out.println( "---------------------------------" );
        System.out.println( "Time taken to sort Dutch" );
        result = SortingAlgorithms.TimeSortingAlgorithms.readFiles( "dutch.txt" );
        System.out.println( "Insertion Sort: " + SortingAlgorithms.TimeSortingAlgorithms.timerInsert( result ) + " Nanoseconds" );
        System.out.println( "Quick Sort: " + SortingAlgorithms.TimeSortingAlgorithms.timerQuick( result ) + " Nanoseconds" );
        System.out.println( "Quick Sort Cut-off: " + SortingAlgorithms.TimeSortingAlgorithms.timerQuickCutOff( result ) + " Nanoseconds" );
        System.out.println( "Quick Sort Median: " + SortingAlgorithms.TimeSortingAlgorithms.timerQuickMedian( result ) + " Nanoseconds" );
        System.out.println( "Three-way Quick Sort: " + SortingAlgorithms.TimeSortingAlgorithms.timerThreeWay( result ) + " Nanoseconds" );


    }
}



