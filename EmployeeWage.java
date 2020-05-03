public class EmployeeWage{
	final int IS_PART_TIME=1;
	final int IS_FULL_TIME=2;
	int EMP_RATE_PER_HOUR=20;
	int NO_OF_DAYS=20;
	int TOTAL_WORKING_HOURS=100;
	//variables
	int totalHoursWorked=0;
	int empHrs=0;
	int empWage=0;
	int totalWage=0;
public static void main(String[] args){
	//CONSTANTS
	EmployeeWage employeeWage=new EmployeeWage();
	System.out.println(employeeWage.computeTotalWorkingHoursWage());
	
}

public  int computeTotalWorkingHoursWage(){
	//computations
	for(int day=0;day<NO_OF_DAYS;day++){
		int empCheck=(int)Math.floor(Math.random()*10%3);
		switch (empCheck){
			case IS_PART_TIME:
			empHrs=4;
			break;
		case IS_FULL_TIME:
			empHrs=8;
			break;
		default:
			empHrs=0;
		}
	totalHoursWorked+=empHrs;
	empWage=empHrs*EMP_RATE_PER_HOUR;
	totalWage+=empWage;
	//System.out.println("The Employee Wage is "+empWage);
	//System.out.println("The Total Wage is "+totalWage);
	//System.out.println("The total Working Hours "+totalHoursWorked);
	//System.out.println("The total Working Hours "+totalHoursWorked);
	}
	return totalHoursWorked;
}
	
}