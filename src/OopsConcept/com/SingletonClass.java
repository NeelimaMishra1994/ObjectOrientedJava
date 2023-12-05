package OopsConcept.com;

public class SingletonClass {
	
	 private SingletonClass(){
		
	}
	 private static SingletonClass instance;
	 
	 public static SingletonClass getInstance() {
		 if(instance == null) {
			 instance = new SingletonClass();
		 }
		return instance;
		 
	 }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingletonClass obj1 = SingletonClass.getInstance();
		SingletonClass obj2 = SingletonClass.getInstance();
		SingletonClass obj3 = SingletonClass.getInstance();

	}

}
