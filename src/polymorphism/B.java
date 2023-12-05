package polymorphism;

import OopsConcept.com.A;

public class B  extends A{

	public B(int num, String name) {
		super(num, name);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	    //A obj1=new A();
		//int a = obj1.num;
		 B obj1=new B(56, "h");//protected members of parent class from different package can be access in the subclass of different package but not in parent class.
		 int a=obj1.num;

	}

}
