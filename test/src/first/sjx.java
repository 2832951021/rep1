package first;

import java.util.Scanner;

import second.Q;

public class sjx {

	public static void main(String[] args) {
		Q s=new Q();
		System.out.print("a=");
		Scanner sc= new Scanner (System.in);
		int a = sc.nextInt();
		System.out.print("b=");
		Scanner sc1= new Scanner (System.in);
		int b = sc1.nextInt();
		System.out.print("c=");
		Scanner sc2= new Scanner (System.in);
		int c = sc2.nextInt();
		int C =s.Q(a, b, c);
		if(C!= 0) {
			System.out.println("三角形的周长是："+C);
		}
		else {
		System.out.println("不能构成三角形");
		}

	}

}
