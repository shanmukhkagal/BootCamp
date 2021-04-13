public class DailyEmployeeWage {
	
	public static final int IS_EMPLOYEE_PRESENT = 1;
	public static final int IS_EMPLOYEE_ABSENT = 0;
	public static final int WAGE_PER_hOUR = 20;
	public static final int WORK_hOURS_PER_DAY = 8;
	
	public void employee_present() {
		
		int c= (int)Math.floor(Math.random() * 10) % 2;	
		
		
        switch(c) {
          case 0:
        	   System.out.println("employee is present");
        	   int daily_employee_wage = WAGE_PER_hOUR*WORK_hOURS_PER_DAY;
        	   System.out.print(daily_employee_wage);
          break;
          
          case 1:
        	  System.out.println("employee is absent");
          break;
          
          case 2:
        	  System.out.println("daily employee wage");
         } 
    }
	public static void main(String[] args) {
		
		DailyEmployeeWage e = new DailyEmployeeWage();
        e.employee_present();
	}
}
