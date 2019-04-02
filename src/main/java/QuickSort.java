class QuickSort extends ThreeWaySort {


    static void quickSort(int[] A, int p, int r) {
        if (p <= r) {
            int pivot = partitionA( A, p, r );
            quickSort( A, p, pivot - 1 );
            quickSort( A, pivot + 1, r );
        }
    }

    static void quickSortCutOff(int[] A, int r, int min) {
        if (A.length < min) System.out.println( "Array doesn't meat minimum value specified. insertion Sort Triggered : " );
        else quickSort(A, 0, r);
    }



    static int partitionA(int[] A, int p, int r) {
        int k = A[r];
        int i = p - 1;
        for (int j = p; j < r; j++)
            if (A[j] <= k) {
                i++;
                swap( A, i, j );
            }
        swap(A,i+1,r);

        return i + 1;
    }


}
