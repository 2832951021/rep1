package second;

public class SZ1 {
	public void one(int[] a) {
		for(int i=0;i<10;i++) {
			System.out.print(a[i]+" ");
		}
	}
	public int max(int [] a) {
		int max = a[0];
		for(int i=0;i<a.length;i++) {
			if(max<a[i]) {
				max=a[i];
			}
		}
		return max;
	}
	public int min(int [] a) {
		int min = a[0];
		for(int i=0;i<a.length;i++) {
			if(min>a[i]) {
				min=a[i];
			}
		}
		return min;
}
}