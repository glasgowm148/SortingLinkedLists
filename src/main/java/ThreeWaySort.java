class ThreeWaySort extends QuickSortMedian {
    static void threeWaySort(int[] A, int r){
        int firstIndex = 0;
        int secondIndex = 0;

        if (r > 0){
            threeWayPartition( A, 0, secondIndex );
            threeWayPartition( A, firstIndex, r );
        }
    }

    private static void threeWayPartition(int[] A, int p, int r) {
        int firstIndex = p - 1;
        int secondIndex = r;

        int j = p--, q = r;

        int v = A[r];

        while (A[++firstIndex] < v) {

            while (v < A[--secondIndex]) { if (j == A[secondIndex]) { return; } }

            if (A[firstIndex] >= A[secondIndex]) { return; }

            swap(A, firstIndex, secondIndex );

            if (A[firstIndex] == v) { j++; swap( A, p, firstIndex ); }

            if (A[secondIndex] == v) { q--; swap( A, secondIndex, q ); }

        }

        swap(A, firstIndex, r );
        firstIndex++;

        for (int k = r - 1; k > A[q]; k--, firstIndex++) swap( A, firstIndex, k );
    }
}
