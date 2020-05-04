public class EmployeeWage{
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

	
public String toString() {
	return "The Wage of "+company+" Employee for WagePerHour "+empRatePerHour+
			" for "+totalDays+" days and for "+totalHours+"hours is "+empWage;
}
	
public static void main(String[] args){

	EmployeeWage employeeWage1=new EmployeeWage("relaince",20,20,100);
	employeeWage1.computeEmployeeWage();
	System.out.println(employeeWage1);
	EmployeeWage employeeWage2=new EmployeeWage("TATA",30,25,150);
	employeeWage2.computeEmployeeWage();
	System.out.println(employeeWage2);
	
}
public EmployeeWage(String company, int empRatePerHour, int noOfDays, int totalWorkingHours) {
	super();
	this.company = company;
	this.empRatePerHour = empRatePerHour;
	this.noOfDays = noOfDays;
	this.totalWorkingHours = totalWorkingHours;
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

}
	