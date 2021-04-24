package nsh.codility;

public class TheMatrix2021C1 implements TheMatrix2021Interface {
    boolean verify(int[] A, int k) {
        int i = 0;
        while (i < A.length) {
            int j = i;
            while (j < A.length && A[j] >= k)
                j++;
            if (j - i >= k)
                return true;
            i = Math.max(j, i + 1);
        }
        return false;
    }

    public int solution(int[] A) {
        for (int k = A.length; k >= 0; k--)
            if (verify(A, k))
                return k;

        return 0;
    }
}
