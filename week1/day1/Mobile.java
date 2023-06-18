package week1.day1;

public class Mobile {
public void makeCall() {
	String mobileModel="Nokia";
	Float mobileWeight=120.15f;
	System.out.println("Mobile Model is "+mobileModel);
	System.out.println("Mobile Weight is "+mobileWeight);
	
}
public void sendMsg() {
	boolean isFullCharged=true;
	int mobileCost=12000;
	System.out.println("Battery is Full charged "+isFullCharged);
	System.out.println("Mobile cost is "+mobileCost);
	
}
	
	public static void main(String[] args) {
	Mobile mob=new Mobile();
	mob.makeCall();
	mob.sendMsg();
	System.out.println("This is my mobile");

	}

}
