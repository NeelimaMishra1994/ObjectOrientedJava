package AbstractDemo;

public class Main {

	public static void main(String[] args) {
		Son son = new Son(30);
		son.career();
		son.partner();
		Daughter daughter = new Daughter(40);
		daughter.career();
		daughter.partner();	
		//Parent p= new Parent();//error!you can not create object of parent class, you can create constructor but not object
		Parent.hello();
		daughter.match();
		son.match();
		Parent p = new Son(40);//we can instantiate abstract class via derived type class. & derived type should bot be abstract , i.e.runtime polymorphism
	}
}
