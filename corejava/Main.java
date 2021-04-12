public class Main {
	public static void main(String[] args)
	{
		Point p=new Point(56, 8);
		
		Point p1=new Point(6, 85);
       
		Line l1=new Line(p,p1);
		
		System.out.println(l1.getLength());
	}
}
