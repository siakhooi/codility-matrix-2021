package nsh.codility;

public class TheMatrix2021C2 implements TheMatrix2021Interface {
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
        int lb = 1;
        int ub = A.length;
        while (lb < ub) {
            int mid = (lb + ub + 1) / 2;
            if (verify(A, mid))
                lb = mid;
            else
                ub = mid - 1;
        }
        return lb;

    }
}
