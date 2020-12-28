
public class GameOfLife {
	
	public boolean[][] createBoard(int n, int l[][]) {
		boolean[][] b =new boolean[n][n];
		for(int i=0; i<l.length;i++) {
			int row = l[i][0];
			int col = l[i][1];
			b[row][col] =true;
		}
		return b;
		
	}
	public void printBoard(boolean b[][]) {
        StringBuffer sub = new StringBuffer();
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (b[i][j])
                    sub.append("*");
                else
                    sub.append(".");
            }
            sub.append("\n");
        }
        System.out.print(sub.toString());
    }
}
