package p_04;

public class Q_06 {

	public static void main(String[] args) {
		int[][] arr = new int[5][];

		// 가변배열의 열 메모리 생성.

		arr[0] = new int[1];
		arr[1] = new int[2];
		arr[2] = new int[3];
		arr[3] = new int[4];
		arr[4] = new int[5];

		int num = 1;

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i + 1; j++) {
				arr[i][j] = num;
				num++;
			}
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
