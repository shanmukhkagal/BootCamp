public class Line {
	
	Point p1;
	Point p2;
	
	public Line(Point p1, Point p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
	double getLength() {
		double Length = Math.sqrt((p2.x-p1.x)*(p2.y-p1.y) + (p2.y-p1.y)*(p2.y-p1.y));
		
		return Length;
	}
}
