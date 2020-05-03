public class EmployeeWage{
public static void main(String[] args){
	//CONSTANTS
	final int IS_PART_TIME=1;
	final int IS_FULL_TIME=2;
	int EMP_RATE_PER_HOUR=20;
	int NO_OF_DAYS=20;
	//variables
	int empHrs=0;
	int empWage=0;
	int totalWage=0;
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
	empWage=empHrs*EMP_RATE_PER_HOUR;
	totalWage+=empWage;
	System.out.println("The Employee Wage is "+empWage);
	System.out.println("The Total Wage is "+totalWage);
}
}
}