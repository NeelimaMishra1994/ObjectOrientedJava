package AbstractDemo;

public abstract class Parent {
		int age;
	
	 public Parent(int age) {
			super();
			this.age = age;
		}
//	 abstract Parent() {!Error, You can not create abstract constructor
//	}
	 static void hello() {
		 System.out.println("Hey");
	 }
	 public void match() {
		 System.out.println("Miss");
	 }
	 
 abstract void career();//so if we have even a single method as abstract in java class, we need to declare class as abstract otherwise we will get error
 abstract void partner();
}

//Note.Abstract fun  means nO body in function
//1.can we have variables in abstract class? yes 
//2.Can you create abstract static method?No, Because abstract methods are meant to be overridden but static method you can not override so there is no point of
//abstract static method
//3.do static method overridden?No
//4.can we create static method in abstract class? yes we can create static method not abstract static method
//5.So In abstract class, you can have abstract & non abstract(Concrete Methods) and static methods.
//6.so if we have final class , we can not inherit it . So in abstract we need to inherit it so we can not have final in abstract class
//7.we can have, final sttaic method & variable both in abstract class