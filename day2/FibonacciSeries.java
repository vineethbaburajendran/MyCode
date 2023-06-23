package week1.day2;



public class FibonacciSeries {

	public static void main(String[] args) {
		int a=0;int b=1;int r=8;int sum;
		
		for (int i = 0; i <= r; i++) {
			sum=a+b;
			a=b;
			b=sum;
			sum=a;
			System.out.println(sum);
			
			
			
		}
	}

}
