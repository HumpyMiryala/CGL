
public class NextGeneration {
	public int countLiveCells(boolean[][] currentGeneration, int p, int q) {
        int n = currentGeneration.length;
        int countOfLives = 0;
        for (int i = p - 1; i <= p + 1; ++i) {
            for (int j = q - 1; j <= q + 1; ++j) {
                if (i != p || j != q) {
                    if (i >= 0 && i < n && j >= 0 && j < n && currentGeneration[i][j]) {
                        countOfLives += 1;
                    }
                }
            }
        }
        return countOfLives;
    }
public boolean[][] generateNextGeneration(boolean currentGeneration[][]) {
    int n = currentGeneration.length;
    boolean[][] nextGeneration = new boolean[n][n];
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            int countOfLiveCells = countLiveCells(currentGeneration, i, j);
            if (currentGeneration[i][j]) {
                if (countOfLiveCells < 2) {
                    nextGeneration[i][j] = false;
                } else if (countOfLiveCells <= 3) {
                    nextGeneration[i][j] = true;
                } else if (countOfLiveCells > 3) {
                    nextGeneration[i][j] = false;
                }
            } else {
                if (countOfLiveCells == 3) {
                    nextGeneration[i][j] = true;
                }
            }
        }
    }
    return nextGeneration;
 }
}
