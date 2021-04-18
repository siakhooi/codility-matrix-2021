package nsh.codility;

public class TheMatrix2021A implements TheMatrix2021Interface{
	public int solution(int[] A) {
		int S[] = new int[A.length];
		int Q[] = new int[A.length];
		int s = -1;

		int m = 1;

		for (int i = 0; i < A.length; i++) {
			int a = A[i];

			if (s == -1) {
				s++;
				S[s] = a;
				Q[s] = 1;
				continue;
			}
			int a0 = S[s];

			if (a0 < a) {
				s++;
				S[s] = a;
				Q[s] = 1;
				continue;
			}
			if (a0 == a) {
				Q[s]++;
				if (Q[s] > m && S[s] > m)
					m = Q[s] > S[s] ? S[s] : Q[s];
				continue;
			} else { // drop
				if (s == 0) {
					S[s] = a; // replace
					Q[s]++;
					if (Q[s] > m && S[s] > m)
						m = Q[s] > S[s] ? S[s] : Q[s];
					continue;
				} else { // a0>a1
					while (s > 0) {
						int a_1 = S[s - 1];
						if (a_1 < a) {
							S[s] = a; // replace
							Q[s]++;
							if (Q[s] > m && S[s] > m)
								m = Q[s] > S[s] ? S[s] : Q[s];
							break;
						} else if (a_1 == a) {
							Q[s - 1] += Q[s];
							Q[s] = 0;
							s--;
							Q[s]++;
							if (Q[s] > m && S[s] > m)
								m = Q[s] > S[s] ? S[s] : Q[s];
							break;
						} else { // a_1>a
							Q[s - 1] += Q[s];
							Q[s] = 0;
							s--;
							if (Q[s] > m && S[s] > m)
								m = Q[s] > S[s] ? S[s] : Q[s];
						}
					}
					if (s == 0) {
						if (S[s] > a) {
							Q[s]++;
							S[s] = a;
						} else if (S[s] == a) {
							Q[s]++;
							if (Q[s] > m && S[s] > m)
								m = Q[s] > S[s] ? S[s] : Q[s];

						} else if (S[s] < a) {
							s++;
							S[s] = a;
							Q[s] = 1;
						}
					}
				}
			}
		}
		while (s > 0) {
			Q[s - 1] += Q[s];
			s--;
			if (Q[s] > m && S[s] > m)
				m = Q[s] > S[s] ? S[s] : Q[s];
		}
		return m;
	}
}
