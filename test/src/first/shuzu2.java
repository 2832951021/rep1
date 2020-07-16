package first;

import second.SZ2;

public class shuzu2 {

	public static void main(String[] args) {
		int a[][] = new int [5][5];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j] = (int) (Math.random()*100);
				}
		}
		SZ2 m =new SZ2();
		m.prin(a);
		System.out.println("max is "+m.max(a));
		System.out.println("min is "+m.min(a));

	}

}
