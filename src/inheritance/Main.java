package inheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Box box1=new Box(4);
//		System.out.println(box1.h+ " "+box1.l+" "+box1.w);
		
		Boxweight box3=new Boxweight();
		Boxweight box4=new Boxweight(2,3,4,5);
		System.out.println(box4.weight+" "+box4.h+" "+box4.w+" "+box4.l);
		Box box5= new Boxweight();//here you willl have access to only parents class object not boxweight object because its not 
								//actually the type of object that determines what member can be access, it is type of refrence variable who determine
		System.out.println(box5.h+" "+box5.w+" "+box5.l);
		
		
		//there are many variables in both parent and child classes
		//you are given access to variable that are in ref type i.e.Boxweight
		//hence, you should have access to weight variables only
		//this also means,that the ones you are trying to access should be intialised 
		//but here, object itself is of parent class ,how will you call the constructor of child class
		//this is why error
		//so child class refrence to parent class constructor we can not do this.
		
//		Boxweight box6= new Box();
//		System.out.println(box6.h+" "+box6.w+" "+box6.l+" "+box6.weight);
	}

}
//Note:Super class don't have idea what sub class contains but sub class have idea what super class contain'