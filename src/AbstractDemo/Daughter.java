package AbstractDemo;

public class Daughter extends Parent {

	public Daughter(int age) {
		super(age);
	}

	@Override
	void career() {
		System.out.println("I am going to be Manager");
		
	}

	@Override
	void partner() {
		System.out.println("I Love Managing things");
		
	}

}
