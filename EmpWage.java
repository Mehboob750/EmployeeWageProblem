public class EmpWage {

  public static final int IS_FULL_TIME = 1;
  public static final int IS_PART_TIME = 2;

	private final String company;
   private final int numOfWorkingDays;
   private final int maxHoursPerMonth;
	private final int empRatePerHour;

	public EmpWage(String company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth) {
                this.company=company;
                this.empRatePerHour=empRatePerHour;
                this.numOfWorkingDays=numOfWorkingDays;
                this.maxHoursPerMonth=maxHoursPerMonth;
      }


	private int computeEmpWage() {
		int empHrs=0, totalWorkingDays=0, totalEmpHrs=0;

		while (totalEmpHrs <=maxHoursPerMonth && totalWorkingDays < numOfWorkingDays) {
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
		return totalEmpHrs * empRatePerHour;
	}

	public static void main(String[] args) {
		EmpWage dMart = new EmpWage("D-Mart",20,3,10);
		EmpWage reliance = new EmpWage("Reliance", 30, 2, 20);

		System.out.println("Total Emp wage for company: " + dMart.company + " is: " + dMart.computeEmpWage());
      System.out.println("Total Emp wage for company: " + reliance.company + " is: " +reliance.computeEmpWage());
	}


}





