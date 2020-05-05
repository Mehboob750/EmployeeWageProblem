public class EmpWage {

  public static final int IS_FULL_TIME = 1;
  public static final int IS_PART_TIME = 2;
  public static final int EMP_RATE_PER_HOUR=20;
  public static final int NUMBER_OF_WORKING_DAYS=2;
  public static final int MAX_HOURS_IN_MONTH=10;

   public static int calculateEmpWage() {
		int empWage = 0, totalEmpWage=0, totalWorkingDays=0, totalEmpHrs=0;

		while (totalEmpHrs <= MAX_HOURS_IN_MONTH && totalWorkingDays < NUMBER_OF_WORKING_DAYS ) {
	      	int empHrs=0;
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
				empWage = empHrs * EMP_RATE_PER_HOUR;
 				totalEmpWage +=empWage;
	  			System.out.println("Emp Wage: "+empWage);
			}
	  	System.out.println("Total Emp Wage: "+totalEmpWage);
		return totalEmpWage;
	}

	public static void main(String[] args) {
		calculateEmpWage();
	}


}





