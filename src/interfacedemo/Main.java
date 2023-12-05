package interfacedemo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Car car = new Car();
		Engine car = new Car();
		//car.a;you can not access this because what you can access is depends on the refrence type
		
	//what thing			//which one of those to access
	//you access dependes   //depends on this
	//on this
		car.acc();
		//car.brake();
		car.start();
		car.stop();
		//car.toString();
		System.out.println(car.toString());
		System.out.println(car.hashCode());
		//car.hashCode();

	}

}
