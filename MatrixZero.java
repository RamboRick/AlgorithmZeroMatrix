package zeromatrix;

public class MatrixZero {
	
	public static void zeroMxtr(int[][] arr){
		if (arr.length == 0){
			return;
		} 
		int rowCount = arr.length;
		int columnCount = arr[0].length;
		
		boolean[] rowCheck = new boolean[rowCount];
		boolean[] columnCheck = new boolean[columnCount];
		
		for(int i = 0; i < rowCount; i++) {
			for (int j = 0 ; j < columnCount; j ++){
				if(arr[i][j] == 0){
					rowCheck[i] = true;
					columnCheck[j] = true;
				}
			}		
		}
		
		for (int i =0; i <rowCount; i++){
			for(int j = 0; j < columnCount; j++){
				if (rowCheck[i] || columnCheck[j]){
					arr[i][j] = 0;
				}
			}
		}
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
