public class EmployeeWage {
	
	int IS_EMPLOYEE_PRESENT = 1;
	int IS_EMPLOYEE_ABSENT = 0;
	
	public void employee_present() {
		
		int c= (int)Math.floor(Math.random() * 10) % 2;	
		
        switch(c)
        {
          case 0:
        	   System.out.println("employee is present");
          break;
          
          case 1:
        	  System.out.println("employee is absent");
          break;
       } 
 }
	
   public static void main(String[] args) {
	  EmployeeWage e = new EmployeeWage();
	  e.employee_present();
   }
}
