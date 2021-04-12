public class Mainuc2 {
	public static void main(String[] args)
	{
		Pointuc2 p=new Pointuc2(6, 85, 34, 45);
		
		Pointuc2 p1=new Pointuc2(6, 85, 34, 45);
		
        Lineuc2 l1=new Lineuc2(p,p1);
		
		l1.equalsMet();
	}
}
