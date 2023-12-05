package polymorphism;

public class ObjectPrintClass {
	int num;
	
	 public ObjectPrintClass(int num){
		 this.num=num;
		
	}
	@Override
	public String toString() {
		return "ObjectPrintClass{"+"num"+num+'}';
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectPrintClass obj=new ObjectPrintClass(54);
		System.out.println(obj);

	}

}
//Note-we can not override static method becuase it's not dependent on object it will always ru only parent class method'