# Codility Challenge: Matrix 2021

## MaxSquareOnMatrix

- Difficulty: Medium
- Find the side length of the biggest black square in a matrix. In each column, black cells start at the bottom of the matrix and count up.
- <https://app.codility.com/programmers/challenges/matrix2021/>
- <https://app.codility.com/programmers/task/max_square_on_matrix/>

## Versions

- Result
  - `Good`: Correctness 100%, Performance 100%.
  - `OK`: Correctness 100%, Performance <100%.
  - `Fail`: Correctness <100%, Performance <100%.
- File naming convention
  - Code `A`: `Matrix2021A.java`
  - Code `B`: `Matrix2021B.java`
  - etc

### Silver Award

| Code | Complexity                          | Description                | Result   | Report                                                                            |
| ---- | ----------------------------------- | -------------------------- | -------- | --------------------------------------------------------------------------------- |
| `A1` | `O(N ** 2)` or `O(N ** 2 * log(N))` | Method: Simple N\*K search | OK (16%) | [WVADP8](https://app.codility.com/cert/view/certWVADP8-CPBWMN9CK93JX8M8/details/) |

### After Challenge Ended

| Code | Complexity                | Description                                               | Result | Report                                                                  |
| ---- | ------------------------- | --------------------------------------------------------- | ------ | ----------------------------------------------------------------------- |
| `B1` | `O(N * log(N))` or `O(N)` | Tracking Stack of Height and Count (using arrays `int[]`) | Good   | [6FUHGY-7Y9](https://app.codility.com/demo/results/training6FUHGY-7Y9/) |
| `B2` | `O(N * log(N))` or `O(N)` | Tracking Stack of Height and Count (using `Stack<Class>`) | Good   | [FEAYQK-AQ2](https://app.codility.com/demo/results/trainingFEAYQK-AQ2/) |

### Solutions provided by Codility

| Code | Complexity                          | Description                          | Result   | Report                                                                  |
| ---- | ----------------------------------- | ------------------------------------ | -------- | ----------------------------------------------------------------------- |
| `C1` | `O(N ** 2)` or `O(N ** 2 * log(N))` | Solution A, Complexity: `O(N^2)`     | OK (16%) | [D93D98-5YK](https://app.codility.com/demo/results/trainingD93D98-5YK/) |
| `C2` | `O(N * log(N))` or `O(N)`           | Solution B, Complexity: `O(N log N)` | Good     | [XZ5NV4-RCK](https://app.codility.com/demo/results/trainingXZ5NV4-RCK/) |
