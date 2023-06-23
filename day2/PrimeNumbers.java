package week1.day2;

public class PrimeNumbers {

	public static void main(String[] args) {
		int no=39;
		boolean flag=false;
		for (int i = 3; i <=no/2; i++) {
		if (no % i ==0) {
		flag = true;
		break;
			
		}

	} 
		if (!flag) {
			System.out.println(no + " is a prime number");
		} else {
System.out.println(no +" is not a prime number");

}
		}

}
