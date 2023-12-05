package OopsConcept.com;

public class A {
	
	protected int num;
	public String name;
	int [] newarray;

	public A() {
		super();
	}



	public A(int num, String name) {
		super();
		this.num = num;
		this.name = name;
		//this.newarray = newarray;
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = new A(4,"Neel");
		System.out.println(obj.num+" "+obj.name+"");

	}

}
