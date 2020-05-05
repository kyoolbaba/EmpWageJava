public class EmployeeWage{
	//CONSTANTS
	final int IS_PART_TIME=1;
	final int IS_FULL_TIME=2;
	//Variables
	private final int empWage;
	private final String company;
	private final int empRatePerHour;
	//private final int noOfDays;
	//private final int totalWorkingHours;
	int totalHours=0,totalDays =0;
	
	public EmployeeWage(String company,int empWage, int empRatePerHour, int totalDays, int totalHours) {
		super();
		this.company = company;
		this.empWage=empWage;
		this.empRatePerHour = empRatePerHour;
		this.totalDays = totalDays;
		this.totalHours = totalHours;
		System.out.println(this);
	}
	
public String toString() {
	return "The Wage of "+company+" Employee for WagePerHour "+empRatePerHour+
			" for "+totalDays+" days and for "+totalHours+"hours is "+empWage;
}
	


}
	