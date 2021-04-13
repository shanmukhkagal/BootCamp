public class LineComparison1 
{
        int x1; 
        int x2;
        int y1;
        int y2;

public LineComparison1(int x1, int x2,int y1, int y2) {
    	  this.x1 = x1;
    	  this.x2 = x2;
    	  this.y1 = y1;
    	  this.y2 = y2;
       }
public static void result(LineComparison1 lc1,LineComparison1 lc2) {
	
	int Length= (int)Math.sqrt((lc1.x2-lc1.x1)^2 + (lc1.y2-lc1.y1)^2);
	int Length1= (int)Math.sqrt((lc2.x2-lc2.x1)^2 + (lc2.y2-lc2.y1)^2);
	String s1 = Length + "";
	String s2 = Length1 + "";
	
	if(s1.equals(s2)) {
		System.out.println("length and length1 are equal");
	}
	
	else {
		System.out.println("length and length1 are not equal");
	}
	
	System.out.println("result is:"+Length);
}
      
    public static void main(String[] args) {
        	LineComparison1  lc1 = new LineComparison1(10,22,5,13);
        	LineComparison1  lc2 = new LineComparison1(10,22,5,13);
        	
        	result(lc1,lc2);
    }
}
