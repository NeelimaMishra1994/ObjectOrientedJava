package OopsConcept.com;

public class WrapperClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a = 10;
//		int b = 20;
		Integer a=10;
		Integer b=20;
		Swap(a,b);
		System.out.println(a + " "+b);
		

	}

	private static void Swap(Integer a, Integer b) {
		// TODO Auto-generated method stub
		Integer temp = a;
		a = b;
		b = temp;
		
	}

}
