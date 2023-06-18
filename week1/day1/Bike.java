package week1.day1;

public class Bike extends Car{

	public static void main(String[] args) {
		Car car=new Car();
		Bike bik=new Bike();
		car.applyBrake();
		car.soundHorn();
		bik.applyBrake();
		bik.soundHorn();

	}

}
