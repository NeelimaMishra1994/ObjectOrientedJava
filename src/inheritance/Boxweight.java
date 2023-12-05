 package inheritance;

public class Boxweight extends Box {
	double weight ;
	
	public Boxweight() {
		
		this.weight = -1;
	}

	public Boxweight(double l,double h, double w,double weight) {
		// TODO Auto-generated constructor stub
		super(l,h,w);//what is this?it means call the parent class constructor
		             //used to initialize values present in parent class
		this.weight=weight;
		//System.out.println("Boxweight: "+super.weight);//so if you want to represent or use something that is specifiaclly to super class can use like this
	}

}
