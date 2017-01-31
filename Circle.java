public class Circle{
	 private Point center;
	 private double radius; 
	 private String name; 
     private static final double pi = 3.141592653589793238462643383279502; 

	 
	 public Circle(){
		Point center = new Point(); 
		radius = 1;
	 }
	 public Circle(double radius){
		Point center = new Point();
		this.radius = radius;
	 }
	 public Circle(Point center){
		center = new Point();
		this.center = center;
		radius = 1; 
	 }
	 public Circle(double radius, Point center){
		center = new Point();
		this.center = center;
		this.radius = radius; 
	 } 
	 
	 public double diameter(){
	  	return radius * 2; 
	 }
	 public double circumference(){
	  	return ((radius * 2) * pi); 
	 }
	 
	 public double area(){
	  	return pi * radius * radius; 
	 }
	 
	 public String toString(){
	  	return center.name; 
	 }
 
 
}