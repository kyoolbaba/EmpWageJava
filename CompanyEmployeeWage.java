public class CompanyEmployeeWage{
	//Variables
	private final int empWage;
	private final String company;
	private final int empRatePerHour;
	int totalHours=0,totalDays =0;
	
	public CompanyEmployeeWage(String company,int empWage, int empRatePerHour, int totalDays, int totalHours) {
		super();
		this.company = company;
		this.empWage=empWage;
		this.empRatePerHour = empRatePerHour;
		this.totalDays = totalDays;
		this.totalHours = totalHours;
		System.out.println(this);
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