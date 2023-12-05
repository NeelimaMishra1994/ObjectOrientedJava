package OopsConcept.com;

public class InnerClasses {//outside classes can not be static class
	
	
	static  class Test{
		   String name;
		public Test(String name) {
			this.name=name;
		}
		
	}
	
	public static void main(String[] args) {
		Test obj1= new Test("harish");//this giving me error becuase me Test class is dependent on some other class ,but if i will make it 
										//static we don't need object
		Test obj2= new Test("Mishra");
		System.out.println(obj1.name);
		System.out.println(obj2.name);
		

	}

}
