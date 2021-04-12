public class Mainuc3 {
	public static void main(String[] args)
	{
		Pointuc3 p=new Pointuc3(6, 85, 34, 45);
		
		Pointuc3 p1=new Pointuc3(6, 85, 34, 45);
		
              
		LineCompare l1=new LineCompare(p,p1);
		
		l1.getLength();
	}
}
