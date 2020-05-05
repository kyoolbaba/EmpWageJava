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
		//System.out.println(this);
	}

	@Override
	public String toString() {
		return "EmployeeWage [empWage=" + empWage + 
				", company=" + company + 
				", empRatePerHour=" + empRatePerHour
				+ ", totalHours=" + totalHours +
				", totalDays=" + totalDays + "]";
	}
	

	


}
	