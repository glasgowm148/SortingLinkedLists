class QuickSortMedian extends SortingAlgorithms {

    static void quickSortMedian(int[] A, int p, int r) {
        if (p < r) {
            int median = medianPartition( A, p, r );
            int part = QuickSort.partitionA( A, p, median );
            quickSortMedian( A, p, p - 1 );
            quickSortMedian( A, part + 1, r );
        }
    }

    private static int medianPartition(int[] A, int p, int r) {
        int median = (p + r) /2;

        if (A[median] < A[p]) swap( A, p, median );

        if (A[r] < A[p]) swap( A, p, r );

        if (A[r] < A[median]) swap( A, median, r );

        swap( A, median, r - 1 );

        return r - 1;

    }
}
