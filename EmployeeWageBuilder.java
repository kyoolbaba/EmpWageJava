import java.util.ArrayList;

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
	private static ArrayList<EmployeeWageBuilder> employeeWageList= new ArrayList<EmployeeWageBuilder>();
	
public EmployeeWageBuilder(String company, int empRatePerHour, int noOfDays, int totalWorkingHours) {
		super();
		this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.noOfDays = noOfDays;
		this.totalWorkingHours = totalWorkingHours;
		this.computeEmployeeWage();
		this.sendValues();
		employeeWageList.add(this);
	}

public static void main(String[] args){
	EmployeeWageBuilder reliance=new EmployeeWageBuilder("relaince",20,20,100);
	EmployeeWageBuilder tata=new EmployeeWageBuilder("TATA",30,25,150);
	EmployeeWageBuilder company1=new EmployeeWageBuilder("Company1",30,25,150);
	returnEmployeeWage();
	returnEmployeeWage("TATA");
}

@Override
public String toString() {
	return "EmployeeWageBuilder [empWage=" + empWage + ", company=" + company + "]";
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

public static void returnEmployeeWage() {
	for (EmployeeWageBuilder s:employeeWageList) {
		System.out.println(s);
	}
}

public static void returnEmployeeWage(String company) {
	for (EmployeeWageBuilder s:employeeWageList) {
		if(s.toString().contains(company)) {
			System.out.println(s);
			break;
		}
	}
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
