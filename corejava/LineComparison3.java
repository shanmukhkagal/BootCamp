public class LineComparison3 
{
       private int x1; 
       private int x2;
       private int y1;
       private int y2;
      
      
public LineComparison3(int x1, int x2,int y1, int y2) {
	  this.x1 = x1;
	  this.x2 = x2;
	  this.y1 = y1;
	  this.y2 = y2;
	 }

public static void result(LineComparison3 lc1,LineComparison3 lc2) {
	int Length= (int)Math.sqrt((lc1.x2-lc1.x1)^2 + (lc1.y2-lc1.y1)^2);
	int Length1= (int)Math.sqrt((lc2.x2-lc2.x1)^2 + (lc2.y2-lc2.y1)^2);
	String s1 = Length + "";
	String s2 = Length1 + "";
	
	int a = s1.compareTo(s2);
	      System.out.println("s1 and s2 comparison"+a);
}
        
public static void main(String[] args) {
        	LineComparison3  lc1 = new LineComparison3(21,82,32,45);
        	LineComparison3  lc2 = new LineComparison3(21,82,32,45);
        	
        	result(lc1,lc2);
    	 }
}
