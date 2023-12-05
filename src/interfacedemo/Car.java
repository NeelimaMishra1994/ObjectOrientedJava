package interfacedemo;

public class Car implements Engine,Brake {
	int a=10;

	@Override
	public void brake() {
		System.out.println("I brake like a normal car");
		
	}

	@Override
	public void start() {
		System.out.println("I start like a normal car");
		
	}

	@Override
	public void stop() {
		System.out.println("I stop like a normal car");
		
	}

	@Override
	public void acc() {
		System.out.println("I acc like a normal car");
		
	}

	@Override
	public void main() {
		// TODO Auto-generated method stub
		Engine.super.main();
	}

//	@Override
//	public void main() {
//		// TODO Auto-generated method stub
//		Brake.super.main();
//	}

}
//If each interfaces have same defualt method then we will get error
//class implementation will have priority over interfaces default method
//static method can not be inherited dats why Static interface method should alsways have body
