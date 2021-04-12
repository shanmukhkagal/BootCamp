public class EmpoyeeWageForMonth {
	  int IS_PRESENT = 1;
	  int EMP_RATE_PER_HOUR = 20;
	  int NUMBER_OF_WORKING_DAYS=20;
	  int salary = 0;
	  int salaryPerday = 0;
	  
	  public static int computeEmpWage() {
		  int totalWorkingDays = 0;
		  int empHrs = 0;
		  while(totalWorkingDays < NUMBER_OF_WORKING_DAYS) {
		  totalWorkingDays = totalWorkingDays + 1;
		  int emp_Check = (int)  Math.floor(Math.random() * 10) % 2;
		  
		  switch(emp_Check) {
		  case IS_PRESENT:
		        empHrs = 8;
                break;
		  default:
			   empHrs = 0;
		  }
		  int salaryPerDay=empHrs * EMP_RATE_PER_HOUR;
		  salary = salaryPerDay *  totalWorkingDays;
	    } 
		return salary;
      }
	  public static void main(String args[]) {
		  System.out.println("Total salary of an Employee for a month is:"+EmpoyeeWageForMonth.computeEmpWage());  
	}
  }
