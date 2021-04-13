public class LineComparison {
        int x1 = 10; 
        int x2 = 17;
        int y1 = 22;
        int y2 = 67; 
      
public void getLength() {
	int Length= (int)Math.sqrt((x2-x1)^2 + (y2-y1)^2);
	
	System.out.println("Length is:"+Length);
}
        
public static void main(String[] args) {
        	LineComparison  lineComparison = new LineComparison();
        	lineComparison.getLength();
    	    }
}
