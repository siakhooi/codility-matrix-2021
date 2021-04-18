package nsh.codility;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public abstract class AbstractTheMatrix2021 {
    abstract TheMatrix2021Interface getObject();

    @Test
    void test1() {
        int[] A = new int[] { 1, 2, 5, 3, 1, 3 };
        int a = 2;

        assertEquals(a, getObject().solution(A));
    }

    @Test
    void test2() {
        int[] A = new int[] { 3, 3, 3, 5, 4 };
        int a = 3;

        assertEquals(a, getObject().solution(A));
    }

    @Test
    void test3() {
        int[] A = new int[] { 6, 5, 5, 6, 2, 2 };
        int a = 4;

        assertEquals(a, getObject().solution(A));
    }

}
