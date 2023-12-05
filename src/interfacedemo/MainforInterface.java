package interfacedemo;

public class MainforInterface implements B {//class to interface we use implements also B is extending A so if you are Implementing B you have to
											//provide implementation for B class method also the class which B have inherited


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A.greet();//you can call the static method using interface name

	}

	@Override
	public void fun() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void greet() {
		// TODO Auto-generated method stub
		
	}
	
}

//why you have default method in interface in JDK 8, if was made to solve abstract problem?
//so thing is, to expand the iterface, if you wnat to change anything in the the pre existing interface without breaking anything you can add the
//functionality.
