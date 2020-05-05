import java.util.*;
public class EmpWageBuilderArrayList {

  public static final int IS_FULL_TIME = 1;
  public static final int IS_PART_TIME = 2;

	private int numOfCompany = 0;
	private ArrayList<CompanyEmpWage> companyEmpWageArrayList = new ArrayList<CompanyEmpWage>();

	private void addCompanyEmpWage(String company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth) {
		CompanyEmpWage companyEmpWageData = new CompanyEmpWage(company,empRatePerHour,numOfWorkingDays,maxHoursPerMonth);
		companyEmpWageArrayList.add(companyEmpWageData);
		numOfCompany++;
	}

	private void computeEmpWage() {
		for(int companyCount=0;companyCount<numOfCompany;companyCount++) {
			int totalEmpWage=this.computeEmpWage(companyEmpWageArrayList.get(companyCount));
			System.out.println(" Total Emp Wage For Company " +companyEmpWageArrayList.get(companyCount).company + " is: " + totalEmpWage);
		}
	}

	public int computeEmpWage(CompanyEmpWage  companyEmpWage) {
		int empHrs=0, totalWorkingDays=0, totalEmpHrs=0;

		while (totalEmpHrs <=companyEmpWage.maxHoursPerMonth && totalWorkingDays <= companyEmpWage.numOfWorkingDays) {
				totalWorkingDays++;
				double empCheck = Math.floor(Math.random()*10)%3;
				switch ((int)empCheck) {
	   			case IS_FULL_TIME:
						empHrs=8;
						break;
					case IS_PART_TIME:
						empHrs=4;
						break;
					default :
						empHrs=0;

					}
				totalEmpHrs += empHrs;
				int dailyWage=companyEmpWage.empRatePerHour*empHrs;
				System.out.println("Day#: "+ totalWorkingDays+ "Emp Hours: "+empHrs+" :Daily Wage:"+dailyWage);
			}
		return totalEmpHrs * companyEmpWage.empRatePerHour;
	}

	public static void main(String[] args) {
		EmpWageBuilderArrayList empWageArrayList = new EmpWageBuilderArrayList();
		empWageArrayList.addCompanyEmpWage("D-Mart",20,2,10);
		empWageArrayList.addCompanyEmpWage("Big Basket", 40, 4, 30);
		empWageArrayList.addCompanyEmpWage("Reliance", 30, 2, 20);

		empWageArrayList.computeEmpWage();
	}

	private class CompanyEmpWage {
		public String company;
		public int empRatePerHour;
		public int numOfWorkingDays;
		public int maxHoursPerMonth;

		public CompanyEmpWage(String company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth) {
				this.company=company;
				this.empRatePerHour=empRatePerHour;
				this.numOfWorkingDays=numOfWorkingDays;
				this.maxHoursPerMonth=maxHoursPerMonth;
		}
	}

}
