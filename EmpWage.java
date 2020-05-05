public class EmpWage {

  public static final int IS_FULL_TIME = 1;
  public static final int IS_PART_TIME = 2;

   public static int calculateEmpWageForCompany(String company,int empRate,int numOfDays, int maxHrs) {
		int empHrs=0, totalWorkingDays=0, totalEmpHrs=0;

		while (totalEmpHrs <= maxHrs && totalWorkingDays < numOfDays ) {
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
				System.out.println("Day#: "+ totalWorkingDays+ "Emp Hours: "+empHrs);
			}
		int totalEmpWage=totalEmpHrs * empRate;
		System.out.println("Total Emp Wage for Company : " +company+ " is : " +totalEmpWage);
		return totalEmpWage;
	}

	public static void main(String[] args) {
		calculateEmpWageForCompany("D-Mart",20,2,10);
		calculateEmpWageForCompany("Reliance",10,4,20);

	}


}





