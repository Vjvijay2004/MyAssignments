package week1.day2;

public class FibonacciSeries {
	public static void main(String[] args) {
		int number=7,n1=0,n2=1,n3;
		System.out.println(n1+","+n2);
		for(int i=2;i<=number;i++) {
			n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
			}
	}

}
