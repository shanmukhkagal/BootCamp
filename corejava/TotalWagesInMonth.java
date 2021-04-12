public class TotalWagesInMonth {
	  int IS_FULL_TIME = 0;
	  int EMP_RATE_PER_HOUR = 20;
	  int NUM_OF_WORKING_DAYS = 20;
	  int MAX_HRS_IN_MONTH = 100;
	  int salary = 0;
	  
	  public static int computeWage() {
		  int empHrs = 0, totalEmpHrs = 0 , totalWorkingDays = 0;
		  while(totalEmpHrs <= 100 && totalWorkingDays < NUM_OF_WORKING_DAYS) {
			  totalWorkingDays++;
			  int empCheck = (int) Math.floor(Math.random() * 10 ) % 1;
			  switch(empCheck) {
			   case IS_FULL_TIME:
			    	 empHrs = 5;
			    	 break;
		       }
			  totalEmpHrs += empHrs;
			  System.out.println("Days:"+totalWorkingDays+" total Emp Hr: "+totalEmpHrs);
           }
		   int totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
		   System.out.println("Emp wage is :"+totalEmpWage);
		   return totalEmpWage;
	  }
	  public static void main(String[] args) {
		  computeWage();
	  }
}
