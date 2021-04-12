public class Lineuc2 {
	
	Pointuc2 p1;
	Pointuc2 p2;
	
	public Lineuc2(Pointuc2 p1, Pointuc2 p2)
	{
		this.p1 = p1;
		this.p2 = p2;
	}
	public int getLength1(){
		return (int)Math.sqrt((p2.x-p1.x)*(p2.y-p1.y) + (p2.y-p1.y)*(p2.y-p1.y));
	}
	public int getLength2(){
		return (int)Math.sqrt((p2.a-p1.a)*(p2.b-p1.b) + (p2.b-p1.b)*(p2.b-p1.b));
	}
	public void equalsMet()
	{
		String s1=""+getLength1();
		String s2=""+getLength2();
		System.out.println(s1.equals(s2));
	}
}
