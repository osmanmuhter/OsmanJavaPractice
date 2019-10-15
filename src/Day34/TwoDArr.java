package Day34;

import java.util.Arrays;

public class TwoDArr {
public static int[][] giveMeTwoDarrs(int row, int col) {
	int[][] arrs = new int[row][col];

	for (int i = 0; i < row; i++) {
		for (int j =0; j <col; j++) {
			arrs[i][j] =j;
		}
	}
	return arrs;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int r = 2;
int c = 3;
int[][] arrrr = giveMeTwoDarrs(3, 3);
System.out.println(Arrays.deepToString(arrrr));

	}

}
