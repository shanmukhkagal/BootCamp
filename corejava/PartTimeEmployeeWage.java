public class PartTimeEmployeeWage {
	int IS_EMPLOYEE_PRESENT = 1;
	int IS_EMPLOYEE_ABSENT = 0;
	int IS_PART_TIME_EMPLOYEE = 2;
	int WAGE_PER_hOUR = 20;
	int WORK_hOURS_PER_DAY = 8;
	int PART_TIME_EMPLOYEE = 4;
	int salary=0;
	
	public void employee_present() {
		
		int salary= (int)Math.floor(Math.random() * 10) % 3;	
		
		switch(salary) {
          case 0:
        	   System.out.println("employee is present and salary is");
        	   int daily_wage= WAGE_PER_hOUR*WORK_hOURS_PER_DAY;
        	   System.out.print(daily_wage);
          break;
          
          case 1:
        	  System.out.print("employee is absent");
          break;
          
          case 2:
        	  System.out.println("part time employee");
        	  int part_time_employee_wage = WAGE_PER_hOUR*PART_TIME_EMPLOYEE;
        	  System.out.print(part_time_employee_wage);
          break;
          
        } 
    }
	
	public static void main(String[] args) {
		
		PartTimeEmployeeWage e = new PartTimeEmployeeWageUseCase3();
		e.employee_present();
		}
}
