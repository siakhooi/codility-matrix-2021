# Codility Challenge: Matrix 2021

## MaxSquareOnMatrix

- Find the side length of the biggest black square in a matrix. In each column, black cells start at the bottom of the matrix and count up.
- [https://app.codility.com/programmers/challenges/matrix2021/](https://app.codility.com/programmers/challenges/matrix2021/)

## Silver Award

| File                 | Complexity                        | Description                | Result |
| -------------------- | --------------------------------- | -------------------------- | ------ |
| **Matrix2021B.java** | `O(N ^ 2)` or `O(N ^ 2 * log(N))` | Method: Simple N\*K search | OK     |

## Others

| File                  | Complexity                        | Description                                                                       | Result |
| --------------------- | --------------------------------- | --------------------------------------------------------------------------------- | ------ |
| **Matrix2021A.java**  | `O(N * log(N))` or `O(N)`         | Method: Tracking Stack of Height and Count (using arrays `int[]`)                 | Good   |
| **Matrix2021A2.java** | `O(N * log(N))` or `O(N)`         | Method: Tracking Stack of Height and Count (using `Stack<Class>`)                 | Good   |
| **Matrix2021C1.java** | `O(N ^ 2)` or `O(N ^ 2 * log(N))` | Java implementation of solution A published by Codility, Complexity: `O(N^2)`     | OK     |
| **Matrix2021C2.java** | `O(N * log(N))` or `O(N)`         | Java implementation of solution B published by Codility, Complexity: `O(N log N)` | Good   |

- Result
  - `Good`: Correctness 100%, Performance 100%.
  - `OK`: Correctness 100%, Performance <100%.
