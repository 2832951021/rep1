package first;

import second.SZ1;

public class shuzu1 {

	public static void main(String[] args) {
		int a[] = new int [10];
		for(int i=0;i<a.length;i++) {
			a[i] = (int) (Math.random()*100);
		}
		SZ1 n =new SZ1();
		n.one(a);
		System.out.println();
		System.out.println("max is "+n.max(a));
		System.out.println("min is "+n.min(a));

	}

}
