package week1.day2;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {
		int num[]= {1,2,3,4,5,6,8,9,10};
		
		Arrays.sort(num);
		for (int i = 1; i <= num.length; i++) {
			if (i!=num[i-1]) {
				System.out.println(i);
				break;
			}
			}
	
}
	}


 