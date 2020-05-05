import java.util.ArrayList;

public class EmployeeWageBuilder {
	//CONSTANTS
	final int IS_PART_TIME=1;
	final int IS_FULL_TIME=2;
	//Variables
	private int empWage=0;
	private  String company;
	private  int empRatePerHour;
	int totalHours=0,totalDays =0;
	private static ArrayList<String> employeeWageList= new ArrayList<String>();

public void addCompany(String company, int empRatePerHour, int noOfDays, int totalWorkingHours) {
	this.company=company;
	this.empRatePerHour=empRatePerHour;
	this.computeEmployeeWage(noOfDays, totalWorkingHours, empRatePerHour);
	String s=this.toString();
	employeeWageList.add(s);
	this.sendValues();
}

public static void main(String[] args){
	EmployeeWageBuilder empBuilder=new EmployeeWageBuilder();
	empBuilder.addCompany("relaince",30,25,150);
	empBuilder.addCompany("TATA",30,25,150);
	empBuilder.addCompany("Bajaj",30,25,150);
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
	for (String s:employeeWageList) {
		System.out.println(s);
	}
}

public static void returnEmployeeWage(String company) {
	for (String s:employeeWageList) {
		if(s.toString().contains(company)) {
			System.out.println(s);
			break;
		}
	}
}

public  void computeEmployeeWage(int noOfDays,int totalWorkingHours,int empRatePerHour){
	totalHours=0;totalDays=0;
	while( totalDays < noOfDays && totalHours < totalWorkingHours ){
		int empHrs=this.getEmployeeWorkingHours();
		int dayWage=empHrs*empRatePerHour;
		empWage+=dayWage;
		totalHours+=empHrs;
		totalDays++;
	}
}	

public EmployeeWage sendValues() {
	return new EmployeeWage(company, empWage, empRatePerHour, totalDays, totalHours);
}
}