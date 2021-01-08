package work4;

public class TestPassObject {
	double radius;
	static int numberOfObjects=0;
	TestPassObject(){
		radius=1;
		numberOfObjects++;
	}
	static int getNumberOfObjects() {
		return numberOfObjects;
	}
	double getArea() {
		return radius*radius*Math.PI;
	}
}
