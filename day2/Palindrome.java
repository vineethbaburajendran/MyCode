package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
	int num=34343;
		int temp=num;
		int rem,pal;
		for (pal=0;num>0;num=num/10) {
		rem=num%10;
		pal=(pal*10)+rem;
		}
if (pal==temp) {
	System.out.println(temp+" is a palindrome");
} else {
System.out.println(temp+" is not a palindrome");
}
	}

}
  