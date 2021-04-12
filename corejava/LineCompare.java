public class LineCompare {
	
	Pointuc3 p1;
	Pointuc3 p2;
	
	public  LineCompare(Pointuc3 p1, Pointuc3 p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
	
	public void getLength() {
		int Length1 = (int)Math.sqrt((p2.x-p1.x)*(p2.y-p1.y) + (p2.y-p1.y)*(p2.y-p1.y));
		int Length2 =(int)Math.sqrt((p2.a-p1.a)*(p2.b-p1.b) + (p2.b-p1.b)*(p2.b-p1.b));
		String s1=""+Length1;
		String s2=""+Length2;
		System.out.println(s1.compareTo(s2));
    }
}
