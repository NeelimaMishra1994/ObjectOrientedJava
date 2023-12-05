package inheritance;

public class Box {
	 double l;
	double h;
	double w;
	//double weight;
	
	Box(){
		super();//here it is not giving error because every class is derived from super class "Object class"
		this.h = -1;
		this.l = -1;
		this.w = -1;
		
	}
	Box(double side){
		this.h = side;
		this.l = side;
		this.w = side;
		
	}
	
	Box(double l,double h, double w){
		this.h = h;
		this.l = l;
		this.w = w;
		
	}
	Box(Box old){
		this.h = old.h;
		this.l =old.l;
		this.w = old.w;
		
	}
	


}
