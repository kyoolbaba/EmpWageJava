
public class EmployeeWageBuilder {
	//CONSTANTS
	final int IS_PART_TIME=1;
	final int IS_FULL_TIME=2;
	//Variables
	private int empWage=0;
	private final String company;
	private final int empRatePerHour;
	private final int noOfDays;
	private final int totalWorkingHours;
	int totalHours=0,totalDays =0;

	
public EmployeeWageBuilder(String company, int empRatePerHour, int noOfDays, int totalWorkingHours) {
		super();
		this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.noOfDays = noOfDays;
		this.totalWorkingHours = totalWorkingHours;
	}


public static void main(String[] args){
	EmployeeWageBuilder reliance=new EmployeeWageBuilder("relaince",20,20,100);
	reliance.computeEmployeeWage();
	reliance.sendValues();
	EmployeeWageBuilder tata=new EmployeeWageBuilder("TATA",30,25,150);
	tata.computeEmployeeWage();
	tata.sendValues();	
}


public int getEmployeeWorkingHours(){
	int empHrs=(int)Math.floor(Math.random()*10%3);
		switch (empHrs){
			case IS_PART_TIME:
				empHrs=4;
				break;
			case IS_FULL_TIME:
				empHrs=8;
				break;
			default:
				empHrs=0;
		}
	return empHrs;
}


public  int computeEmployeeWage(){
	while( totalDays < noOfDays && totalHours < totalWorkingHours ){
		int empHrs=this.getEmployeeWorkingHours();
		int dayWage=empHrs*empRatePerHour;
		empWage+=dayWage;
		totalHours+=empHrs;
		totalDays++;
	}
	return empWage;
}	
public EmployeeWage sendValues() {
	return new EmployeeWage(company, empWage, empRatePerHour, totalDays, totalHours);
}
}
