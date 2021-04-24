package nsh.codility;

public class TheMatrix2021B implements TheMatrix2021Interface {
    public int solution(int[] A) {
        int r = 0;
        for (int i = 0; i < A.length; i++) {
            int f = i + 1;// square count, no to find
            int s = A.length - i; // test count

            for (int j = 0; j < s; j++) {
                int t = 0;
                for (int k = 0; k < f; k++) {
                    if (A[j + k] >= f) {
                        t++;
                        if (t == f)
                            break;
                    } else {
                        break;
                    }
                }
                if (t == f) {
                    r = f; // square found
                    break;
                }
            }
            if (r != f)
                break; // not found
        }

        return r;
    }
}
