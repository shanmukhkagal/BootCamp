public class EmpWage {

	   public static void main(String[] args)
	{
	        int IS_FULL_TIME = 0;
	        int IS_PART_TIME = 1;
	        int salary=0;

	        int fullDay=8;
	        int halfDay=4;


	         int wage=20;

	        int empCheck = (int)Math.floor(Math.random() * 10) /  2;
	        switch(empCheck)
                {
	        case 1:System.out.println("Emp full time salary");
	               salary=wage*fullDay;

	               System.out.println(salary);

	               break;

	        case 2:System.out.println("Emp part time salary");

	               salary=wage*halfDay;
	               System.out.println(salary);

	               break;

	        case 3:System.out.println("full salary");

	              for(int i=1;i<100;i++)
	              {
	            	  salary=wage*i;
	            	  System.out.println("salary per our "+i+ " is" +salary);
	            }
	              break;

	          default:System.out.println("absent");
	      }
	}
}

