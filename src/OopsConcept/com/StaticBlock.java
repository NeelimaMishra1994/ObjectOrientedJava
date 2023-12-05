package OopsConcept.com;

public class StaticBlock {
	
	static int a=4;
	static int b;
	//will run only once,when the first object is created i.e. when the class is loaded for the first time
	static {
		System.out.println("Hello I am in static block");
		b= a*5;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticBlock sb= new StaticBlock();
		System.out.println(StaticBlock.a+ " "+StaticBlock.b);

	}

}
//Note1. static method and variable can access only static members it can not access non-statuc but if you want to acccess then you can creare
//class object, then with object refrence you can access non-static members inside static function.
//non-static method can access static , no problem at all
//2.outside classes can not be static class