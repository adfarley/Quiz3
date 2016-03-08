package Triangle;

public class Triangle extends GeometricObject {

private double side1 = 1.0;
private double side2 = 1.0;
private double side3 = 1.0;

double perimeter = side1 + side2 + side3;
double hP = perimeter / 2.0;

public Triangle() {
}

public Triangle(double side1, double side2, double side3){
	super();
	this.side1 = side1;
	this.side2 = side2;
	this.side3 = side3;

}
public double getPerimeter(){
	return side1 + side2 + side3;
/*/ returns the perimeter of the triangle/*/
}
public double getArea(){
	 return Math.sqrt(hP*(hP-side1)*(hP-side2)*(hP-side3));
/*/ method that returns the area from the given sides/*/
	
}
public String toString() {
	return "the sides of the triangle are " + side1 + ", " + side2 + ", and " + side3 ;
/*/returns the given values of the sides/*/
}
}

