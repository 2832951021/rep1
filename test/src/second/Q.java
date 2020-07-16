package second;

public class Q {
	public int Q(int a,int b,int c){
		int C=0;
		if((a+b>c)&&(a+c>b)&&(b+c>a)){
			C=a+b+c;
		}
		return C;
	}
}
