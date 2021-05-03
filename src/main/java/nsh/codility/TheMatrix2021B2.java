package nsh.codility;

import java.util.Stack;

public class TheMatrix2021B2 implements TheMatrix2021Interface {
	class Square {
		int height, width;

		Square(int height, int width) {
			this.height = height;
			this.width = width;
		}
	}

	int M = 1;

	void calculateMax(Square a) {
		if (a.height > M && a.width > M)
			M = Math.min(a.height, a.width);
	}

	public int solution(int[] A) {
		Stack<Square> S = new Stack<Square>();

		for (int i = 0; i < A.length; i++) {
			int a = A[i];

			if (S.isEmpty()) {
				S.push(new Square(a, 1));
				continue;
			}
			Square a0 = S.peek();

			if (a > a0.height) {
				S.push(new Square(a, 1));
				continue;
			}
			if (a == a0.height) {
				a0.width++;
				calculateMax(a0);
				continue;
			}
			// a<a0.height
			a0 = S.pop();
			while (!S.isEmpty()) {
				Square a1 = S.peek();
				// a>a1, a replace a0
				if (a > a1.height) {
					a0.height = a;
					a0.width++;
					S.push(a0);
					calculateMax(a0);
					break;
				}
				// a==a1
				if (a == a1.height) {
					a1.width += a0.width + 1;
					calculateMax(a1);
					break;
				}
				// a<a1
				if (a < a1.height) {
					a1.width += a0.width;
					calculateMax(a1);
					a0 = S.pop();
				}
			}
			if (S.isEmpty()) {
				a0.height = a;
				a0.width++;
				S.push(a0);
				calculateMax(a0);
			}
		}

		Square a0 = S.pop();
		while (!S.isEmpty()) {
			S.peek().width += a0.width;
			calculateMax(a0);
			a0 = S.pop();
		}
		return M;
	}
}
