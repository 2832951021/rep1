package second;

public class SZ2 {
	public void prin(int a[][]) {
		for(int []i:a) {
			for(int j:i) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

	public int max(int [][] a) {
		int max = a[0][0];
		for(int []i:a) {
			for(int j:i) {
				if(max<j) {
					max=j;
				}
			}
		}
		return max;
	}
	public int min(int [][] a) {
		int min = a[0][0];
		for(int []i:a) {
			for(int j:i) {
				if(min>j) {
					min=j;
				}
			}
		}
		return min;
	}

}
