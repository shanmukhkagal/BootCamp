import java.util.ArrayList;
import java.util.HashMap;

//interface
interface EmployeeWage
{
	public void company(String company, int wage_per_hr, int working_days_per_month, int max_working_hrs);
	public ArrayList<Integer> wageCalculator(CompanyInfo cI);
	public void getByName(String name);
}

//CLASS TO STORE COMPANY DETAILS
class CompanyInfo
{
	// VARIABLES
	public final String company;
	public final int wage_per_hr;
	public final int working_days_per_month;
	public final int max_working_hrs;
	private int totalWage;
	public ArrayList<Integer> dailyWage;

	public CompanyInfo(String company, int wage_per_hr, int working_days_per_month, int max_working_hrs)
	{
		this.company = company;
		this.wage_per_hr = wage_per_hr;
		this.working_days_per_month = working_days_per_month;
		this.max_working_hrs = max_working_hrs;
	}

	public void setTotalWage(int totalWage)
	{
		this.totalWage = totalWage;
	}

	public void setDailyWage(ArrayList<Integer> daily_wage)
	{
		this.dailyWage = daily_wage;
	}

	public ArrayList<Integer> getDailyWages()
	{
		return dailyWage;
	}

	public int getTotalWage()
	{
		return totalWage;
	}

	public String toString()
	{
		System.out.println("Company: "+company);
		return "DailyWage: "+dailyWage+"\n"+"Total Wage: "+totalWage;
	}
}
